package Array.Matrix;

// given unsorted matrix sort and print matrix.

import java.util.Collections;

import static java.util.Arrays.sort;

public class SortedMat {

    static int[] mat(int[][] ar,int n){

        int[] temp = new int[n*n];
        int size = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < ar[i].length; j++) {

                temp[size++] = ar[i][j];

            }

        }

        sort(temp);



        return temp;

    }
    static void print(int[][] ar, int n){

        int[] temp = mat(ar,n);

        int k = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < ar[0].length; j++) {

                ar[i][j] = temp[k++];

                System.out.print(ar[i][j]+" ");;
            }
            System.out.println();
        }


    }

    public static void main(String[] args) {

        int[][] ar = {{5,4,1},
                {7,9,8},{2,6,3}};

        int n = ar.length;

        print(ar,n);

    }



}
