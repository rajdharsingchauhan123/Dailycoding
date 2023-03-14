package hunderedquestion;

public class demo111 {
    public static  void occrence(int arr[],int n ,int x){
        int count=0;
        for(int i=0;i<n;i++){
            if(x==arr[i]){
                count++;
            }
        }
        System.out.println(count);

    }

    public static void main(String[] args) {
        int arr[]={1,2,5,6,6,44,3,3,3,3};
        int x=3;
        int n= arr.length;
        occrence(arr,n,x);

    }
}
