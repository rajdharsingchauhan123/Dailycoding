package hunderedquestion.exception;

import java.util.Scanner;

public class ExceptionDemo11 {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        System.out.println("please inter a number");
        int roll=s.nextInt();
        if(roll<0){
            throw new ArithmeticException("roll number cant'be negative");

        }else {
            System.out.println("valid roll number");
        }
    }
}
