package Array;

import java.util.Arrays;

public class TransposeMat {

    static int[][] solution(int[][] mat){
        int[][] a = new int[mat[0].length][mat.length];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0 ; j < mat[0].length; j++) {

               a[j][i] = mat[i][j];
            }


        }
        return a;
    }

    public static void main(String[] args) {
        int[][] a = {{1,2,3},
                {4,5,6}
        };

        System.out.println(Arrays.deepToString(solution(a)));
    }
}
