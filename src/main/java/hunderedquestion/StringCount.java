package hunderedquestion;

public class StringCount {
    public static void main(String[] args) {
        String string ="rajdhar";
        String s="";
        char ch;
        for(int i =0 ;i<string.length();i++){
          ch=  string.charAt(i);
      s=ch+s;
        }
        System.out.println(s);

    }

}
