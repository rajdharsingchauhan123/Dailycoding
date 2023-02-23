package hunderedquestion;

import java.util.Scanner;

public class Demo14 {
    public static void main(String[] args) {
        int i,j,size, dup_count=0;

        Scanner sc =new Scanner(System.in);
        size =sc.nextInt();
        int [] Dup_count_arr= new int[size];
        for (i =0;i<size;i++){
            Dup_count_arr[i]=sc.nextInt();

        }
        for (i=0;i<size;i++){
            for (j=i+1;j<size;j++){
                if(Dup_count_arr[i]!=Dup_count_arr[j]){
                    dup_count++;
                    break;
                }
            }
        }
        System.out.println(dup_count);
    }
}
