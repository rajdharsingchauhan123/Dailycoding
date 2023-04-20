package hunderedquestion.leetcode;

public class RemoveDuplicate1 {
    public static int removeDuplicate(int []nums){

            int j=1;
            for(int i=1;i<nums.length;i++){
                if(nums[i-1]!=nums[i]){

                    nums[j]=nums[i];
                    j++;
                }
            }


            return j;


    }
    public static void main(String[] args) {
        int nums[]={1,1,1,2,3};
        int n=removeDuplicate(nums);

        System.out.println(removeDuplicate(nums));


    }
}
