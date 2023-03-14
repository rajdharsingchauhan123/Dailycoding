package hunderedquestion;

import java.util.Scanner;

public class Day101 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int num= scanner.nextInt();
        if(num%7==1){
            System.out.println("number  a leap year ");
        }
        System.out.println("number is not a leap year");
    }
}
