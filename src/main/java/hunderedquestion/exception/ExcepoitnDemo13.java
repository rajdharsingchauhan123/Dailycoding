package hunderedquestion.exception;

public class ExcepoitnDemo13 {
    public static  void func() throws ArithmeticException{

//tr
//        System.out.println(1/0);
        throw new ArithmeticException( "hello coder");



    }
    public static void main(String[] args) {
        try{
            func();

        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }



    }
}
