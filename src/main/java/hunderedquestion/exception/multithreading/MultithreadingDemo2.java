package hunderedquestion.exception.multithreading;

public class MultithreadingDemo2 extends Thread {
    public void run(){
        System.out.println("start the thread");
    }

    public static void main(String[] args) {
        MultithreadingDemo2 obj=new MultithreadingDemo2();
        obj.start();
    }
}
