package hunderedquestion.exception.multithreading;

public class MultithreadingDemo7 extends Thread {
    public void run(){
        System.out.println("running thread name is :"+Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        MultithreadingDemo7 t1=new MultithreadingDemo7();
        MultithreadingDemo7 t2=new MultithreadingDemo7();
        System.out.println("t1 thread priority"+t1.getPriority());
        System.out.println("t2 thread priority"+t2.getPriority());

        t1.start();
        t2.start();
    }
}
