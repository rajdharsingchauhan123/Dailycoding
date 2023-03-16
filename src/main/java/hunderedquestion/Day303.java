package hunderedquestion;

public class Day303 {
    public static void main(String[] args) {
        int a[][]=new int[3][3];
        for(int row=0;row< a.length;row++){
            for(int col=0;col<a[row].length;col++){
                a[row][col]=row+col;
                if(row==col){
                    System.out.println(a[row][col]);
                }

            }
        }

        for(int[] temp:a){
            for(int val:temp){
                System.out.print(val+" ");

            }
            System.out.println();
        }

    }
}
