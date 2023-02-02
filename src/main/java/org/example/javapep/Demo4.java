package org.example.javapep;

import java.util.Scanner;

public class Demo4 {
    public static void main(String[] args) {
        // find the factorial a number
        // 5*4*3*2*1
        int result=1;
        Scanner scanner =new Scanner(System.in);
        Integer number =scanner.nextInt();
//        int number =6;

        while (number>0){

           result*=number;
            number--;


        }
        System.out.println(result);





    }
}
