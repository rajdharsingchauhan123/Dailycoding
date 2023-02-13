package hunderedquestion;

import java.util.Scanner;

public class demo6 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int num=scanner.nextInt();
        for(int i=1;i<num;i++){
            for(int j=i;j<=i;j++){
                System.out.println(i*j);

            }

        }
    }
}
