package hunderedquestion;

import java.util.Arrays;

public class Day35 {
    public static void main(String[] args) {
        int arr[]={2,3,5,3,6,888};
        Arrays.sort(arr);
        System.out.println(arr[0]);
        System.out.println(arr[arr.length-1]);
    }
}
