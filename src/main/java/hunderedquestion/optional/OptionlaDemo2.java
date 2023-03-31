package hunderedquestion.optional;

public class OptionlaDemo2 {
    public static void main(String[] args) {
        String country ;
        exampleOne(null);
        exampleTwo(null);

    }
    public static void exampleOne(String country){
        System.out.println("print country in ");
    }
    public static  void exampleTwo(String country){
        if(country!=null){
            System.out.println("hello");
        }
        else
            System.out.println("there is no such country");
    }
}
