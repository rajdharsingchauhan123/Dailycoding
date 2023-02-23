package hunderedquestion;


public  class  demo251 {
    public static void main(String[] args) {
        Runnable r1 =new Runnable() {
            @Override
            public void run() {
                System.out.println("thread 1 is running ");
            }
        };
//        Thread thread =new Thread();
      //  thread.start();
//        thread.run();
        r1.run();

        // using lambda
        Runnable runnable =()->{
            System.out.println("thread 2 is running");
        };
//        Thread thread1 =new Thread(runnable);
//        thread1.start();
        runnable.run();
    }
}
