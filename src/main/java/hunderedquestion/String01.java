package hunderedquestion;

public class String01 {
    public static void main(String[] args) {
        // "abcdef"
        String name="rajdhar";
        String na=" ";
        char a=name.charAt(0);
        System.out.println(a);
        for (int i=0;i<name.length();i++){
            char c = name.charAt(i);
            na=c+na;

        }
        System.out.println(na);
    }
}
