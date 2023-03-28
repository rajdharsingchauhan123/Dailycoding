package hunderedquestion.exception;

import java.util.Scanner;

public class ExcepitnDemo12 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter your age");
        int age = s.nextInt();
        try {


            if (age < 5) {
                throw new ArithmeticException("not allowed your age less than 5");
            } else if (age > 20) {
                throw new ArithmeticException("Not allowed your age greater than 20");

            } else {
                System.out.println("welcome");
            }

        }catch (ArithmeticException e){
            System.out.println("an exception is thrown ");
            System.out.println(e.getMessage());
        }
    }
}