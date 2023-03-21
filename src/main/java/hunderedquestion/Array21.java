package hunderedquestion;

public class Array21 {
    public static void sumOfIndex(int arr[],int sum ){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==sum){
                    System.out.println(i+""+j);
                }
            }
        }


    }
    public static void main(String[] args) {
        int arr[]={1,2,3,7,5};
        int n=arr.length;
        int sum=12;

        sumOfIndex(arr ,sum);
    }
}
