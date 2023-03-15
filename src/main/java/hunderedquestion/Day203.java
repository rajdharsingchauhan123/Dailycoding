package hunderedquestion;

import java.util.Scanner;

public class Day203 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int sum=0;
        int num;
        int n =scanner.nextInt();
        while(n>0){
            num=n%10;
            sum= sum+num;
            n=n/10;

        }
        if(n%sum==0){
            System.out.println("the neive number");

        }
        else
            System.out.println("not a neive number");
    }
}
