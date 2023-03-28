package hunderedquestion;

public class ExcepiotnDemo9 {
    static  void  fun(){
        try{
            throw  new NullPointerException("Demo");
        }catch (NullPointerException e){
            System.out.println("caught expeton ");
            throw  e;
        }
    }
    public static void main(String[] args) {

        try{
            fun();
        }catch (NullPointerException e){
            System.out.println("caough mai n");
        }

    }
}
