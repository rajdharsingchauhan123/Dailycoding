package hunderedquestion;

public class Day38 {
    public static void main(String[] args) {
        int[][] a={{2,3,2,2},{1,2,3,4},{1,2,3,4}};

        for(int[] temp:a){
            for(int val:temp){
                System.out.print(val+" ");
            }
            System.out.println();
        }

    }
}
