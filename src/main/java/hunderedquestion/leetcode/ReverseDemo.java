package hunderedquestion.leetcode;
import org.example.Pizza;

public class ReverseDemo {
    public static void main(String[] args) {
        String str = "Radar", reverseStr = "";

        int strLength = str.length();

        for(int i=(strLength-1);i>=0;--i) {
            reverseStr = reverseStr + str.charAt(i);



        }
        if(str.toLowerCase().equals(reverseStr.toLowerCase())){
            System.out.println(str);

        }
       else {
            System.out.println(str+"not a pilondrome");
        }

    }
}
