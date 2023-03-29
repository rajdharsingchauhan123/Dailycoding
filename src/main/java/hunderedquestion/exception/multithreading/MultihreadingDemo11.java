package hunderedquestion.exception.multithreading;

public class MultihreadingDemo11 extends Thread{
    @Override
    public void run() {
        for(int i=0;i<3;i++){
            System.out.println(Thread.currentThread().getName()+"is control");
        }
    }

    public static void main(String[] args) {
        MultihreadingDemo11 t1 =new MultihreadingDemo11();
        MultihreadingDemo11 t2 =new MultihreadingDemo11();
        t1.start();
        t2.start();
        for (int i=0;i<3;i++){
                t1.yield();
            System.out.println(Thread.currentThread().getName()+"is control");
        }
    }
}
