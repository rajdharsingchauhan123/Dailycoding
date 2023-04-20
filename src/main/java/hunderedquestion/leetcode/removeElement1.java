package hunderedquestion.leetcode;

public class removeElement1 {
    public  static int removeElement(int []nums,int val){
        int i=0;
        int n=nums.length;
        while (i<n){
            if(nums[i]==val){
                nums[i]=nums[n-1];
                n--;

            }
            else {
                i++;
            }
        }
        return n;
    }
    public static void main(String[] args) {
        int []nums={1,2,4,5,6};
        int val=5;
        System.out.println(removeElement(nums,val));
    }
}
