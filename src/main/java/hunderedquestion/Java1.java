package hunderedquestion;

import java.util.Scanner;

public class Java1 {
    public static void main(String[] args) {
//        Java Program to Check Whether a Number is Positive or Negative

        Scanner scanner=new Scanner(System.in);
        int number=scanner.nextInt();
        if(number<0){
            System.out.println(number+"the number is negtive");
        }
        else
            System.out.println(number+" is  postive");
    }
}
