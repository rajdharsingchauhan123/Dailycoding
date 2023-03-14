package hunderedquestion;

public class D1010 {

    // 121234   count the number

    public static void main(String[] args) {
        int number =123999994;
        int count =0;
        int num = 0;

        while (number!=0){
            count =count+number%10;

           number=number/10;
        }
        System.out.println(count);


    }
}
