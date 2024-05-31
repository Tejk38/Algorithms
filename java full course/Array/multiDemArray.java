package Array;

import java.util.Arrays;

public class multiDemArray {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3,4},
                {5,6},
                {7,8,9}
        };
        for(int row = 0; row<arr.length;row++){
            int col =0;
            while (col<arr[row].length) {
                System.out.print(arr[row][col]+" ");

                col++;
            }
            System.out.println();
        }
    }
}
