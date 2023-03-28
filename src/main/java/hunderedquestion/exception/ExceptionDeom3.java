package hunderedquestion.exception;

public class ExceptionDeom3 {
    public static void main(String[] args) {
        int a=10;
        for(int i=2;i>=0;i--){
            try{
                System.out.println(a/i);
                System.out.println("hello try  ");

            }
            catch (ArithmeticException e){
                System.out.println("hello");

            }



        }
    }
}
