package hunderedquestion;

public class Java5 {
    public static void main(String[] args) {
      int number=1223;
      int m=0;
      int a;
      int n;

      while (number>0){
          a=number%10;
          ++a;

         // System.out.println(++a);
          m=m*10+a;

          number=number/10;
          //System.out.println(number);
      }
      n=m;
      m=0;
      while (n>0){
          a=n%10;
          m=m*10+a;
          n=n/10;

      }
        System.out.println(m);

        System.out.println(m);
    }
}
