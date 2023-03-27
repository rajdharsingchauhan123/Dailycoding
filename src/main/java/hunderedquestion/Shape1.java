package hunderedquestion;

public interface Shape1 {

    public  void Area(int a,int b);
}
class Demo {
    public static void main(String[] args) {
        Shape1 shape1=(int c,int d)->{
            System.out.println(c*d);
        };
        shape1.Area(2,3);
    }
}
