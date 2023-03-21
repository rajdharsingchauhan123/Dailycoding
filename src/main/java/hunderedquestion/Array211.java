package hunderedquestion;

import java.util.Arrays;

public class Array211 {
    public  static  int print2largest(int arr[],int n){

        Arrays.sort(arr);
        int large=arr[n-1];
        for(int i=n-1;i>=0;i--){
            if(arr[i]<large){
                large=arr[i];
                break;
            }
        }
//        if(large==arr[n-1]){
//            return -1;
//        }
        return large;

    }
    public static void main(String[] args) {
        int arr[]={16,17,4,3,5,2};
     int n =arr.length;
        System.out.println(print2largest(arr,n));
    }
}
