package hunderedquestion;

public class Day39 {
    public static void main(String[] args) {


    int n = 3;
    int m = 3;
    int[][] matrixA = {
            {1,6,8},
            {5,8,0},
            {2,5,9}
    };
    int[][] matrixB = {
            {7,9,2},
            {1,0,6},
            {4,3,5}
    };
    int[][] matrixC = new int[n][m];
        for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            matrixC[i][j] = matrixA[i][j]+matrixB[i][j];
        }
    }
        for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            System.out.print(matrixC[i][j]+" ");

        }
        System.out.println();
    }
}
}
