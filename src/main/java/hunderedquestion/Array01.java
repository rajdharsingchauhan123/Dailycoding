package hunderedquestion;

public class Array01 {
    // find the fist repeating element in the array
    // like input 12342
    // output is 2
    public static void repeatingEle(int arr[],int n){
        for(int i =0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    System.out.println(arr[i]);

                }

            }
            break;
        }



    }
    public static void main(String[] args) {
        int arr[]={1,2,1,3,2,3};
        int n =arr.length;
        repeatingEle(arr,n);


    }
}
