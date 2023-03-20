package hunderedquestion;

public class String02 {
    public static void main(String[] args) {
        String name="rajdhar";
        char[] c=name.toCharArray();
        for(int i= c.length-1;i>=0;i--){
            System.out.print(c[i]);
        }
    }
}
