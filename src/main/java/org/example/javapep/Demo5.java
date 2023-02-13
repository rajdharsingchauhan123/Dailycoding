package org.example.javapep;

import java.util.Scanner;

public class Demo5 {
    public static void main(String[] args) {
         String result=" ";
        Scanner scanner =new Scanner(System.in);

        int i =scanner.nextInt();
        for (int j=0;j<=i;j++){
            result=result+j;

        }
        System.out.println(result);

    }
}
