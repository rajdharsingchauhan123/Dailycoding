package hunderedquestion.leetcode;

public class LeetCodeDemo {

    public static int maxArea(int[] height) {
//        int maxarea = 0;
//        for (int left = 0; left < height.length; left++) {
//            for (int right = left + 1; right < height.length; right++) {
//                int width = right - left;
//                maxarea = Math.max(maxarea, Math.min(height[left], height[right]) * width);
//            }
//        }
//        return maxarea;

//    }
        int l = 0;
        int r = height.length - 1;
        int max = 0;
        while (l < r) {
            int lh = height[l];
            int rh = height[r];
            int min_h = Math.min(l, r);
            max = Math.max(max, min_h * (r - l));
            if (l < r) l++;
            else r--;
        }
        return max;

    }
    public static void main(String[] args) {
        int []height={1,8,6,2,5,4,8,3,7,8};
        int n= height.length;
        System.out.println(maxArea(height));


    }
}