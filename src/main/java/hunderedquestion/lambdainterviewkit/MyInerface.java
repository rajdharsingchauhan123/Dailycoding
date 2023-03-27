package hunderedquestion.lambdainterviewkit;

public interface MyInerface {
    String reverse(String n);
}
class main{
    public static void main(String[] args) {
        MyInerface myInerface=(str)->{
            String result="";
            for (int i=str.length()-1;i>0;i--){
                result +=str.charAt(i);

            }
            return result;

        };
        System.out.println(myInerface.reverse("LAMBDA"));
    }
}
