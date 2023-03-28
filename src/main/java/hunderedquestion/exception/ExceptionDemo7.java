package hunderedquestion.exception;

public class ExceptionDemo7 {
    static void canVote(int age){
        if(age<18)
            try {
                throw new Exception();
            }catch (Exception e){
                System.out.println("you are not adult");
            }
            else{
            System.out.println("you can vote");
        }
    }
    public static void main(String[] args) {

        canVote(12);
        canVote(29);
    }
}
