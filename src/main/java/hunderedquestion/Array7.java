package hunderedquestion;

import java.util.Scanner;

public class Array7 {
    public static void main(String[] args) {
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
