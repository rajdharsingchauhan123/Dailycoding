package hunderedquestion;

public class arrayDay13 {
    public static void main(String[] args) {

        // find the two largest element in the array
        int arr[]={2,3,5,6,33,22};// 3 2 5556
        int n =arr.length;
        int largest1=arr[0];
        int largest2=arr[1];
        int temp;

        if(largest1<largest2){
            temp=largest2;
            largest2=largest1;
            largest1=temp;


        }

        for(int i=2;i<n;i++){
            if(arr[i]>largest1){
                largest1=arr[i];
                


            } else if (arr[i]>largest2 && arr[i]!=largest1) {
                largest2=arr[i];
                
            }

        }
        System.out.println(largest1);
        System.out.println(largest2);


    }
}
