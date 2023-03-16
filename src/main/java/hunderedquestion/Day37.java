package hunderedquestion;

public class Day37 {
    public static void main(String[] args) {
//        int [][] a={{1,2,3,4,5},{1,2,3,4}};
//        int b [][]={{1,2,3,4,5},{1,3,3,5}};
        int c[][]=new int[2][3];

       for(int row=0;row< c.length;row++){
           for(int col=0;col<c[row].length;col++){
               c[row][col]=row+col;

           }
       }
       for (int[] temp:c){
           for(int val:temp){
               System.out.print(" "+val);
           }
           System.out.println(" ");
       }
    }
}
