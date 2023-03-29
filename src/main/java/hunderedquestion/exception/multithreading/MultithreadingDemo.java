package hunderedquestion.exception.multithreading;

public class MultithreadingDemo extends Thread{

    @Override
    public void run() {
     try {
         System.out.println(Thread.currentThread().getId());
     }catch (Exception e){
         System.out.println("Exception is caught");
     }
    }

    public static void main(String[] args) {
        int n=9;
        for (int i=0;i<n;i++){
            MultithreadingDemo obj=new MultithreadingDemo();
            obj.start();
        }


    }
}
