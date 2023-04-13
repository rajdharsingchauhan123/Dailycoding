package hunderedquestion.exception.multithreading;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public abstract class BaseHealthChecker implements Runnable {
private CountDownLatch _latch;
private String  _serviceName;
private boolean _serviceUP;

public  BaseHealthChecker(String _serviceName,CountDownLatch latch){
    super();
    this._latch=latch;
    this._serviceName=_serviceName;
    this._serviceUP=false;
}

    @Override
    public void run() {
        try {
            verifyService();
            _serviceUP=true;

        }catch (Throwable t){
            t.printStackTrace(System.err);
            _serviceUP=false;

        }
        finally {
            if(_latch!=null){
                _latch.countDown();
            }
        }
    }
    public String getServiceName() {
        return _serviceName;
    }

    public boolean isServiceUp() {
        return _serviceUP;
    }
    //This methos needs to be implemented by all specific service checker
    public abstract void verifyService();

}
class NetworkHealthChecker extends BaseHealthChecker{

    public NetworkHealthChecker( CountDownLatch latch){
        super("network",latch);
    }

    @Override
    public void verifyService() {

        System.out.println("checking "+ this.getServiceName());

        try {
            Thread.sleep(7000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println(this.getServiceName()+"up");


    }
}
class ApplicationStartupUtil{

    private static List<BaseHealthChecker>_service;
    private  static CountDownLatch _latch;

    private ApplicationStartupUtil(){}

    private final static ApplicationStartupUtil INSTANCE=new ApplicationStartupUtil();
    public static ApplicationStartupUtil getInstance()
    {
        return INSTANCE;
    }
    public static boolean checkExternalServices() throws Exception
    {
        //Initialize the latch with number of service checkers
        _latch = new CountDownLatch(3);

        //All add checker in lists
        _service = new ArrayList<BaseHealthChecker>();
        _service.add(new NetworkHealthChecker(_latch));
//        _service.add(new CacheHealthChecker(_latch));
//        _service.add(new DatabaseHealthChecker(_latch));

        //Start service checkers using executor framework
        Executor executor = Executors.newFixedThreadPool(_service.size());

        for(final BaseHealthChecker v : _service)
        {
            executor.execute(v);
        }

        //Now wait till all services are checked
        _latch.await();

        //Services are file and now proceed startup
        for(final BaseHealthChecker v : _service)
        {
            if( ! v.isServiceUp())
            {
                return false;
            }
        }
        return true;
    }
}

class Main {
    public static void main(String[] args)
    {
        boolean result = false;
        try {
            result = ApplicationStartupUtil.checkExternalServices();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("External services validation completed !! Result was :: "+ result);
    }}