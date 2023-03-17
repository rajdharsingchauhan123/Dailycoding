package hunderedquestion;

public class ArrayDay12 {

    public static void main(String[] args) {
        // find the second largest & smallest element in the array
        int arr[]={1,233,4,23,5,666};
        int n =arr.length;
        int temp;

        for (int i = 0; i < n; i++)
        {
            for (int j = i + 1; j < n; j++)
            {
                if (arr[i] > arr[j])
                {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Second Largest:"+arr[n-2]);
        System.out.println(arr[1]);
        System.out.println("Smallest:"+arr[0]);
    }


    }

