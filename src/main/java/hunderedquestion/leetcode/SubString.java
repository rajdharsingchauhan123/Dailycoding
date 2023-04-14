package hunderedquestion.leetcode;

import java.util.Arrays;

public class SubString {

    static  int longestUniqueSubsttr(String str){

       String test="";
       int maxLength=-1;
        if (str.isEmpty()) {
            return 0;
        }
        // Return one if string length is one
        else if (str.length() == 1) {
            return 1;
        }

        for(char c:str.toCharArray()){
            String s = String.valueOf(c);

            if(test.contains(s)){
               test= test.substring(test.indexOf(s)+1);
            }
           test= test+String.valueOf(c);

            maxLength = Math.max(test.length(), maxLength);
        }
        return maxLength;


    }
    public static void main(String[] args) {
        String str = "geeksforgeeks";
        System.out.println("The input string is " + str);

        int len = longestUniqueSubsttr(str);
        System.out.println("The length of the longest "
                + "non-repeating character "
                + "substring is " + len);
    }
}
