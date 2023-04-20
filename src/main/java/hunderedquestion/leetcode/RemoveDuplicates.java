package hunderedquestion.leetcode;

public class RemoveDuplicates {

    public static int removeDuplicate(int[]nums,int n){

     if(n==0|| n==1)
         return n;
       int temp[]=new int[n];
       int j=0;

       for(int i=0;i<n-1;i++){

           if(nums[i]==nums[i+1])
               temp[j++]=nums[i];
       }

       temp[j++]=nums[n-1];

       for(int i=0;i<j;i++){
           nums[i]=temp[i];

       }
       return j;





    }
    public static void main(String[] args) {
        int nums[] = {1, 1, 1, 2};
        int n = nums.length;

        n = removeDuplicate(nums, n);
        for (int i = 0; i < n; i++) {
            System.out.println(nums[i]);
        }
    }}
