package hunderedquestion;

import java.util.Arrays;

public class arrayDay11 {
    public static void main(String[] args) {
        int arr[]={1,222,4,5,6};
        int n =arr.length;
//        Arrays.sort(arr);
//        System.out.println(arr[n-1]);
        int max;
        max= arr[0];

        for(int i=0;i<n;i++){
            if(max<arr[i]){
                max=arr[i];
            }

        }
        System.out.println(max);

    }
}
