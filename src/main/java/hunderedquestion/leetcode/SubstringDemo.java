package hunderedquestion.leetcode;

import java.util.HashMap;

public class SubstringDemo {
    static int longestUniqueSubsttr(String s) {

        HashMap<Character,Integer>seen=new HashMap<>();
        int start=0;
        int maximum_length = 0;
        for(int end =0;end<s.length();end++){
            if (seen.containsKey(s.charAt(end))){
                start=Math.max(start,seen.get(s.charAt(end))+1);

            }
            seen.put(s.charAt(end),end);
            maximum_length = Math.max(maximum_length, end-start + 1);
        }
        return maximum_length;
    }
    public static void main(String[] args) {

        String s = "geeksforgeeks";
        System.out.println("The input String is " + s);
        int length = longestUniqueSubsttr(s);
        System.out.println("The length of the longest non-repeating character substring is " + length);
    }
    }
}
