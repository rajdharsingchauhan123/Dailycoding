package hunderedquestion.exception.multithreading;

public class MultithreadingDemo4 extends Thread{
    @Override
    public void run() {
        for(int i=1;i<5;i++){
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);


            }
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        MultithreadingDemo4 obj=new MultithreadingDemo4();
            obj.start();

    }
}
