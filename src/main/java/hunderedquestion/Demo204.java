package hunderedquestion;

import javax.script.ScriptContext;
import java.util.Scanner;

public class Demo204 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int n =scanner.nextInt();

        int sum=0;
        int i=1;
        while (i<=n/2){
            if(n%i==0){
                sum =sum+i;

            }
            i++;

        }
        if(sum==n){
            System.out.println("number is perfect");
        }
        else
            System.out.println("otherwise number is not perfect");
    }
}
