package hunderedquestion;

public class Day33 {
    public static void main(String[] args) {
        int arr[] = {1, -299, 4, 6, -3, -6};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                sum = sum + arr[i];

            }
            else if (arr[i]<0){
                sum=sum+arr[i];

            }


        }
//        System.out.println(sum);
        System.out.println(sum);
    }
}

