package hunderedquestion;

import java.util.Arrays;

public class Day34 {
    public  static void reverseArray(int arr[],int n){
        int k = 0;
        int temp[] = new int[arr.length];

        for (int i = arr.length; i > 0; i--) {
            temp[k] = arr[i];
            k++;



        }

        for (int i = 0; i < arr.length; i++) {
            arr[i]=temp[k];


        }

    }
    public  static void  printArray(int arr[],int n){
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }

    }



    public static void main(String[] args) {
        int arr[] = {1, -299, 4, 6, -3, -6};
        int n = arr.length;
        reverseArray(arr,n);
        printArray(arr,n);

}}