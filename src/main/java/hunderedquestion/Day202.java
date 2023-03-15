package hunderedquestion;

import java.util.Scanner;

public class Day202 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int number;

        int sum=0;

        int n =scanner.nextInt();
        while(n!=0){
            number=n%10;

            sum=sum + (number*number*number);
            n=n/10;

        }
        System.out.println(sum);
        if(sum==n){
            System.out.println("number is armstrog"+n);
        }

    }
}
