package hunderedquestion.exception;

public class ExceptionDemo5 {
    public static void main(String[] args) {
        try {
            System.out.println(1/0);
            try {
                int a[]={1,2,3,55};
                System.out.println(a[5]);
            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println("array out of bound exception");
            }
        }catch (ArithmeticException e){
            System.out.println("Arithmetic Exception");
        }
    }
}
