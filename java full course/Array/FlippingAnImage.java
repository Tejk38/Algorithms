package Array;

import java.util.Arrays;

public class FlippingAnImage {

    static int[][] flip(int[][] a){
        for (int[] row : a) {
            int start = 0;
            int end = row.length - 1;
            while (start <= end) {
                int temp = row[start];
                row[start] = row[end];
                row[end] = temp;

                start++;
                end--;

            }


        }

    return invertimage(a);
    }
    static int[][] invertimage(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length ; j++) {

                if(arr[i][j] == 1){
                    arr[i][j] = 0;
                }else{
                    arr[i][j] = 1;
                }

            }



        }

        return arr;
    }

    public static void main(String[] args) {
        int[][] ar = {{1,1,0},
                {1,0,1},
                {0,0,0}
        };
        flip(ar);
        for (int i = 0; i < ar.length ; i++) {
            for (int j = 0; j < ar[0].length ; j++) {
                System.out.print(ar[i][j] + " ");

            }
            System.out.println();

        }
    }

}

