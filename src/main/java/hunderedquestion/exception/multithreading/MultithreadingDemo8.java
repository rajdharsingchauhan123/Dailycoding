package hunderedquestion.exception.multithreading;

public class MultithreadingDemo8 extends Thread{
    @Override
    public void run() {
        System.out.println("Priority of thread is "+Thread.currentThread().getPriority());
    }

    public static void main(String[] args) {
        MultithreadingDemo8 t1=new MultithreadingDemo8();
        MultithreadingDemo8 t2=new MultithreadingDemo8();
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);
       t2.start();
        t1.start();
    }

}
