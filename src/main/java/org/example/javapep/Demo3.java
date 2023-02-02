package org.example.javapep;

import java.util.Scanner;

public class Demo3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        switch (a) {
            case 72:
                System.out.println("marks is a grade");
                break;
            case 82:
                System.out.println("marks is a grade ");
                break;
            default:
                System.out.println("not a good marks");

        }
    }
}