package hunderedquestion.exception;

public class ExceptionDemo {
    public static void main(String[] args) {
        try {
            System.out.println(1/0);

        }catch (ArithmeticException e){
            System.out.println("hello"+e.getLocalizedMessage());
        }


        System.out.println("END OF PROGRAM");
    }
}
