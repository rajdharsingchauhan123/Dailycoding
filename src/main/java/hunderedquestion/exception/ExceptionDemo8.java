package hunderedquestion.exception;

public class ExceptionDemo8 {
    static void  func(int a ) throws  Exception {
        System.out.println(10/a);
    }
    public static void main(String[] args) {
        try {
            func(0);
        }catch (Exception e){
            System.out.println("can't devive by zero");
        }


    }
}
