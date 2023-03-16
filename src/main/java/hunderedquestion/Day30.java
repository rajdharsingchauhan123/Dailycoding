package hunderedquestion;

import java.util.Scanner;

public class Day30 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int arr[]= new int[5];
        for(int i=0;i< arr.length;i++){

            arr[i]= scanner.nextInt();
        }
        System.out.println("you enter the number");

        for(int i=0;i< arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
