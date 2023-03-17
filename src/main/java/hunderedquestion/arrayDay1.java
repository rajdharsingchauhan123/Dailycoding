package hunderedquestion;

public class arrayDay1 {
    public static void main(String[] args) {
        int arr[]={1,3,4,5,6};
        int n =arr.length;
        int count=0;
        int i=0;

      try {
          while (arr[i]!=0){
              i++;

              count++;
          }
      }
       catch (Exception e){
          System.out.println(count);
       }
        System.out.println(n);

    }
}
