package hunderedquestion;

import java.util.HashSet;

public class Array02 {
    public static void repeatingEle(int arr[]){
        int min=-1;

        HashSet<Integer>set=new HashSet<>();

        for(int i =arr.length-1;i>=0;i--) {
            if (set.contains(arr[i]))
                min = i;

            else
                set.add(arr[i]);
        }

            if(min!=-1){
                System.out.println(arr[min]);
            }
            else {
                System.out.println("there are no repeating element");
            }





        }


    public static void main(String[] args) {


        int arr[] = { 10, 5, 3, 4, 3, 5, 6 };

        repeatingEle(arr);
    }
}