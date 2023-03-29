package hunderedquestion.exception.multithreading;

public class MultithreadignDemo3 implements Runnable{
    @Override
    public void run() {
        System.out.println("using threading runnable");

    }

    public static void main(String[] args) {
        MultithreadignDemo3 multithreadingDemo3=new MultithreadignDemo3();
      Thread thread=new Thread(multithreadingDemo3);
      thread.start();

    }
}
