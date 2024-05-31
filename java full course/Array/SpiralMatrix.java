package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SpiralMatrix {
    public static void main(String[] args) {
        int[][] mat = {{1,2,3,4},
                {5,6,7,8},
                {9,10,11,12}
        };
        List<Integer> a = spiralOrder(mat);
        System.out.println(a);

    }
    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<Integer>();

        if (matrix.length == 1) {
            return res;
        }
        int rowbegin = 0;
        int rowend = matrix.length - 1;
        int colbegin = 0;
        int colend = matrix[0].length - 1;

        while (rowbegin <= rowend && colbegin <= colend) {
            //traverse right
            for (int i = colbegin; i <= colend; i++) {
                res.add(matrix[rowbegin][i]);

            }
            rowbegin++;
            //traverse down
            for (int i = rowbegin; i <= rowend; i++) {
                res.add(matrix[i][colend]);

            }
            colend--;
            //traverse left
            if (rowbegin <= rowend) {
                // Traverse Left
                for (int j = colend; j >= colbegin; j--) {
                    res.add(matrix[rowend][j]);
                }
            }
            rowend--;

            if (colbegin <= colend) {
                // Traver Up
                for (int j = rowend; j >= rowbegin; j--) {
                    res.add(matrix[j][colbegin]);
                }

            }
            colbegin++;


        }
        return res;
    }


}
