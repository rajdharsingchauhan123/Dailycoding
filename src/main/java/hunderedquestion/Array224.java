package hunderedquestion;

public class Array224 {
    public static void printNUm(int n){
        if(n==0)
            return ;

        printNUm(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {

        int n =10;
        printNUm(n);
//        System.out.println(a);
        // PRINT THE 1 TO 10 WITHOUT USING LOOP


    }
}