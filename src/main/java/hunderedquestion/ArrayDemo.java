package hunderedquestion;

public class ArrayDemo {
    public  static  void rotateArray(int arr[],int n,int d){
        int temp[]=new int[n];
int k=0;

        for(int i=d;i<n;i++){
            temp[k]=arr[i];
            k++;



        }
        for(int i=0;i<d;i++){
            temp[k]=arr[i];
        }
        for(int i=0;i<n;i++){
            arr[i]=temp[i];
        }


    }
    static void printArray(int arr[],int n){
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,5,6,7,8};
        int d=2;
        int n =arr.length;
        rotateArray(arr,n,d);
        printArray(arr,n);


    }
}

