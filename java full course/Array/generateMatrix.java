package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class generateMatrix {
    static int[][] genMat(int n) {
        int count = 1;
        int[][] mat = new int[n][n];
        int rowbegin = 0;
        int rowend = mat.length - 1;
        int colbegin = 0;
        int colend = mat[0].length - 1;




            while (rowbegin <= rowend && colbegin <= colend) {
                //traverse right
                for (int i = colbegin; i <= colend; i++) {
                    mat[colbegin][i] = count++;

                }
                rowbegin++;

                //traverse down
                for (int i = rowbegin; i <= rowend; i++) {
                    mat[i][colend] = count++;

                }
                colend--;

                //traverse left
                if (rowbegin <= rowend) {
                    // Traverse Left
                    for (int i = colend; i >= colbegin; i--) {
                        mat[rowend][i] = count++;
                    }
                }
                rowend--;


                if (colbegin <= colend) {
                    // Traver Up
                    for (int i = rowend; i >= rowbegin; i--) {
                        mat[i][colbegin] = count++;
                    }

                }
                colbegin++;



            }

        return mat;
    }

    public static void main(String[] args) {
        int[][] mat = {{1,2,3,4},
                {5,6,7,8},
                {9,10,11,12}
        };
        int n = 4;
        int[][] a = genMat(n);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

    }
}
