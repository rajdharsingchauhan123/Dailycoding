package hunderedquestion;

import java.util.Scanner;

public class Demo8 {
    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);
        int num =scanner.nextInt();
      int days =num%30;
      int month=num/30;
        System.out.println(days);
        System.out.println(month);
    }
}
