package hunderedquestion;

public class Array223 {
    public static void main(String[] args) {
        int arr[]={2,3,4,3,21,2};
        for(int i=0;i<arr.length;i=i+2){
         if(i%2==0){
             System.out.println(arr[i]+" ");
         }
        }
    }
}
