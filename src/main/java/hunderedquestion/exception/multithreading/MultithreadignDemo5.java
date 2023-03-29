package hunderedquestion.exception.multithreading;

public class MultithreadignDemo5 extends Thread{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        MultithreadignDemo5 obj=new MultithreadignDemo5();
        MultithreadignDemo5 obj1=new MultithreadignDemo5();
        obj1.start();
        obj.start();
    }
}
