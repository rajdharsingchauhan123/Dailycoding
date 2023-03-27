package hunderedquestion.lambdainterviewkit;

public interface GenericInterace <T>{



    T func(T t);
}
class Main{
    public static void main(String[] args) {
        GenericInterace<String>reverse=(str)->{
            String result=" ";
            for (int i=str.length()-1;i>0;i--){
                result +=str.charAt(i);

            }
            return result;


        };
        System.out.println(reverse.func("rajdhar"));

        GenericInterace<Integer>factorial=(n)->{
            int result=1;
            for (int i=1;i<=n;i++){
                result =result*i;
            }
            return result;
        };
        System.out.println(factorial.func(7));
    }

}
