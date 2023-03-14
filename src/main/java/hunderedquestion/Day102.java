package hunderedquestion;

import java.util.Scanner;

public class Day102 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int num=scanner.nextInt();
       // int num1= scanner.nextInt();
       if(num>=400 && num<=600){
           System.out.println("silver card");
       }
       else if (num>=600&& num<=800) {
           System.out.println(" Golden Card");

       } else if (num>=800 && num<=850) {
           System.out.println(" Platinum Card");

       }
    }
}
