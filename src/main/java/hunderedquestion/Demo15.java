package hunderedquestion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class Demo15 {

    public static  int countOccurence(int arr[],int x){
        int count=0;
        for(int i=0;i< arr.length;i++){
            if(arr[i]==x){
                count++;

            }
            System.out.println(arr[-1]);
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[]={1,3,3,3,5,4,3};
        int x =6;
        System.out.println(countOccurence(arr,x));


    }




    }

