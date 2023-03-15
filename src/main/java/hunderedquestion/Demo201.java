package hunderedquestion;


import java.util.Scanner;

public class Demo201 {
    public static int fib(int a){
        if(a==0||a==1)
            return a;

        return fib(a-1)+fib(a-2);
    }


    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int a = scanner.nextInt();

        System.out.println(fib(a));
    }
}