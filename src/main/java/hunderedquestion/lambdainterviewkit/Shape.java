package hunderedquestion.lambdainterviewkit;


@FunctionalInterface  public interface Shape {
    void area();
    int hashCode();
    default void run(){
        System.out.println("heelo");
    }
    private void go(){
        System.out.println("heeloo");
    }
    static void fast(){
        System.out.println("hello");
    }


}

class Demo{
    static int  a =000;
    public static void main(String[] args) {
         int b=220;
        Shape shape= ()-> {

            System.out.println("helelo "+a);

        };
        int i = a++;
        System.out.println(i);
        shape.run();

    }
}
