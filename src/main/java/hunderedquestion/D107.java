package hunderedquestion;

public class D107 {

    // sum of odd number

    public static void main(String[] args) {
        int arr[] = {11, 2, 3, 5, 6, 2, 1};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                sum = sum + arr[i];

            }
        }
        System.out.println(sum);
    }
}