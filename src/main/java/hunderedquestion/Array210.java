package hunderedquestion;

public class Array210 {
    public static void main(String[] args) {
        int arr[]={1,2,3,-2,5};
        int n =arr.length;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        System.out.println(sum);
    }
}
