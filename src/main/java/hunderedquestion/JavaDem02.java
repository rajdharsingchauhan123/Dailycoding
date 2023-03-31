package hunderedquestion;

import java.util.Arrays;

public class JavaDem02 {
    public static void main(String[] args) {
        String[] s = {"abc", "bc"};

        String s1 = "abc";
        String s2 = "d";


        for (int i = 0; i < s1.length(); i++) {

            for (int j = 0; j < s2.length(); j++) {
                if (s1.charAt(i) == s2.charAt(j)) {
                    System.out.println("ture");
                }
                System.out.println("false");
            }


        }
    }}
