package hunderedquestion.leetcode;

import java.util.LinkedHashSet;

public class RemoveDuplicateUsingset {
    public static void removeDuplicates(int a[]){
        LinkedHashSet<Integer>set=new LinkedHashSet<>();
        for(int i=0;i<a.length;i++){
            set.add(i);

        }
        System.out.println(set);
    }
    public static void main(String[] args) {
        int a[] = {5,2,6,8,6,7,5,2,8};

        // Function call
        removeDuplicates(a);
    }
}
