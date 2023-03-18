package hunderedquestion;

public class BinarySearchIpl {
  public  static int binarySearch(int arr[],int target){
      int l=0;
      int r=arr.length-1;

      while (l<=r) {


          int mid;
          mid = (l + r) / 2;
          if (l > +r) {
              return -1;
          } else if (arr[mid] == target)
              return target;

          else if (arr[mid] > target) {
              r = mid - 1;

          } else
              l = mid + 1;

      }
      return -1;
  }
    public static void main(String[] args) {
        int arr[]={2,3,4,3333,};

        int target=3333;
       //int mid;

        System.out.println(  binarySearch(arr,target));

    }
}
