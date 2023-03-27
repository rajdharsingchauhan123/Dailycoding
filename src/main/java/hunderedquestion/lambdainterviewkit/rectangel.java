package hunderedquestion.lambdainterviewkit;
@FunctionalInterface
public interface rectangel {
    void hello();
    int hashCode();
    String toString();
    boolean equals(Object obj);
    default  void run(){
        System.out.println("hello ");
    }
    private void go(){
        System.out.println("go");
    }
    static  void work(){
        System.out.println("go to work ");
    }

}
