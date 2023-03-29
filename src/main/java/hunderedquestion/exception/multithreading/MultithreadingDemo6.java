package hunderedquestion.exception.multithreading;

public class MultithreadingDemo6 extends Thread{
    public void run(){
        for(int i=0;i<19;i++){

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            System.out.println(i);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        MultithreadingDemo6 multithreadingDemo6=new MultithreadingDemo6();
        MultithreadingDemo6 multithreadingDemo61=new MultithreadingDemo6();
        multithreadingDemo61.start();

//        multithreadingDemo61.join();

        multithreadingDemo6.start();
    }
}
