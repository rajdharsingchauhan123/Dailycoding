package hunderedquestion.leetcode;

import java.util.Arrays;

public class RemoveElement {
    public static int removeElement(int nums[],int n){
        int i;
        int j=1;

        Arrays.sort(nums);
        for( i=1;i<nums.length;i++){
            if(nums[i-1]!=n){

                nums[j]=nums[i];
                j++;


            }
        }
        return j;
    }
    public static void main(String[] args) {
        int nums[]={3,2,2,3,5,6};
        int n=3;

        System.out.println(removeElement(nums,n));
    }
}
