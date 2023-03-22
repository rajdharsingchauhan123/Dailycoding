package hunderedquestion;

import java.util.ArrayList;
import java.util.List;

public class Array221 {
    public static void main(String[] args) {
        int arr[]={15,4,45,12,7};
        int n= arr.length;

        ArrayList<Integer>arrayList=new ArrayList<>();

       for(int i=0;i<n;i++){
           if(arr[i]==i+1)
               arrayList.add(arr[i]);
       }
        System.out.println(arrayList);


    }
}
