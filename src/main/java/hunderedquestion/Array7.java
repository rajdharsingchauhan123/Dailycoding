package hunderedquestion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Array7 {
    public static void main(String[] args) throws IOException {
//        char n;
//        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
//       n= (char)bufferedReader.read();
        Scanner scanner =new Scanner(System.in);
        char s =scanner.next().charAt(0);

        switch (s){
            case 'a' :
                System.out.println("print vowel");
            default:
                System.out.println("constant");
        }
    }
}
