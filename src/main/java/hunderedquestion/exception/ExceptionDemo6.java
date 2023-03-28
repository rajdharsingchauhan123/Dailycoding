package hunderedquestion.exception;

public class ExceptionDemo6 {
    public static void main(String[] args) {
        try {
            System.out.println(1/0);

        }
        catch (ArithmeticException e)

        {
            System.out.println(e.getMessage());
            }
            finally
        {
            System.out.println("you are finally block");
        }
    }
}
