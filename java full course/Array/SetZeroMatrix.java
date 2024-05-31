package Array;

import java.util.Arrays;

public class SetZeroMatrix {
    public static int[][] zeromat(int[][] matrix){
        int m = matrix.length;
        int n = matrix[0].length;

        int[] rowar = new int[m];
        int[] colar = new int[n];

        Arrays.fill(rowar,1);
        Arrays.fill(colar,1);

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] ==0){
                    rowar[i] = 0;
                    colar[j] = 0;
                }
            }

        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                if (rowar[i] ==0||colar[j]==0){
                    matrix[i][j] = 0;
                }

            }

        }
        return matrix;
    }

    public static void main(String[] args) {
        int[][] mat = {{1,1,1},{1,0,1},{1,1,1}};
        System.out.println(Arrays.toString(zeromat(mat)));


    }
}
