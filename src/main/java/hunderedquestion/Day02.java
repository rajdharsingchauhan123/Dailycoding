package hunderedquestion;

public class Day02 {
    public static void main(String[] args) {
        int arr[]={1,23,4,5,6,7,8};
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                System.out.println("print the even number in array" +arr[i]);
            }
            else
                System.out.println("print "+arr[i]);
        }
    }
}
