package hunderedquestion.exception.multithreading;

public class MultithreadigDemo9  extends Thread{
    @Override
    public void run() {
        System.out.println("running");
    }

    public static void main(String[] args) {
        MultithreadigDemo9 t1=new MultithreadigDemo9();
        MultithreadigDemo9 t2=new MultithreadigDemo9();
        t1.setName("hello raj");
        t2.setName("hello demo");
        System.out.println(t1.getName());
        System.out.println(t2.getName());
        t1.start();
        t2.start();
    }
}
