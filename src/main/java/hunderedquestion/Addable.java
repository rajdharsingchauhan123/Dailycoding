package hunderedquestion;

public interface Addable {
    int add (int a,int b);
}
 class LambdaDemo21{
    public static void main(String[] args) {
        // lambda using only without return type
        Addable addable =(a,b)->(a+b);

        System.out.println(addable.add(23,53));
        Addable addable1 =(int a ,int b)->{return (a+b);};
        System.out.println(addable1.add(122,35));


    }

}
