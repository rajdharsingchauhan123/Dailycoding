package hunderedquestion.exception.multithreading;

public class MultithradingDemo1 implements Runnable{
    @Override
    public void run() {
        try {
            System.out.println(Thread.currentThread().getId());
        }catch (Exception e){
            System.out.println("Exception is cought");
        }

    }

    public static void main(String[] args) {
        int n=8;
        for(int i=0;i<n;i++){
            Thread obj=new Thread(new MultithradingDemo1());
            obj.start();
        }

    }
}
