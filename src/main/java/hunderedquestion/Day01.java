package hunderedquestion;

import java.util.Scanner;

public class Day01 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int num=scanner.nextInt();
        if(num%2==0){
            System.out.println("the number is even ");
        }
        else {
            System.out.println("the number isn odd");
        }
    }
}
