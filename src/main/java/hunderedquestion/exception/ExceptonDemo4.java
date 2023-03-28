package hunderedquestion.exception;

public class ExceptonDemo4 {
    public static void main(String[] args) {
        try {
            try {
                int []a={1,3,5,6};
                System.out.println(a[6]);
            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println("out of bound ");
            }
            System.out.println(4/0);

        }catch (ArithmeticException e){
            System.out.println("AIRTHMATIC EXECPTION ");
        }
    }
}
