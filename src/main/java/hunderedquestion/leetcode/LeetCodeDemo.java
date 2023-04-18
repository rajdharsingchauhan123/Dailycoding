package hunderedquestion.leetcode;

public class LeetCodeDemo {
//    public static int sortArray(int arr[]){
//
//    }
    public static void main(String[] args) {

        int arr[]={-1,0,1,2,-1,-4};
        int n=arr.length;


        for (int i = 0; i < n - 2; i++) {
            // Fix the second element as A[j]
            for (int j = i + 1; j < n - 1; j++) {
                // Now find the third number
                for (int k = j + 1; k < n; k++) {
                    if (arr[i] + arr[j] + arr[k] == 0) {
                        System.out.print("Triplet is " + arr[i] + ", "
                                + arr[j] + ", " + arr[k]);

                    }

                }
            }
        }

    }
}
