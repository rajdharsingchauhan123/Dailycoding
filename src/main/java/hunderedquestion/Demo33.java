package hunderedquestion;

public class Demo33 {
    static void subArraySum(int arr[],int n,int sum){
        for (int i=0;i<n;i++){
                int currentSum=arr[i];
                if(currentSum==sum){
                    System.out.println("sum found the indexe" +i);
                }
                else
                {
                    for (int j=i+1;j<n;j++){
                        currentSum+=sum;
                        if(currentSum==sum){
                            System.out.println("Sum found between indexe" +i+"and  "+j);
                            return;
                        }
                    }
                }
        }
        System.out.println("no sub array found");
        return;
    }


    public static void main(String[] args) {
        int arr[]={1,4,0,0,3,10,5};
        int sum=7;
        int n = arr.length;
        subArraySum(arr,n,sum);

    }
}
