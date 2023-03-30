package hunderedquestion.exception.multithreading;

public class MultithreadingDemo10 extends Thread{


    @Override
    public void run() {

        try {
            Thread.sleep(1221);
            System.out.println(Thread.currentThread().isAlive());
        } catch (InterruptedException e) {
                throw new RuntimeException(e);
        }
        System.out.println("hello thread is running");
    }

    public static void main(String[] args) {
        MultithreadingDemo10 t1 =new MultithreadingDemo10();
//        Thread t1=new Thread();
        System.out.println(t1);

        System.out.println(t1.isAlive());
      t1.start();
        System.out.println(t1.isAlive());
    }
}
