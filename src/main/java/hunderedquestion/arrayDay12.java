package hunderedquestion;

public class arrayDay12 {
    public static int max(int arr[]){

        int max=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {

        int arr[]={255,34,33,53};
        System.out.println(max(arr));

    }
}
