package Array;

import java.util.Arrays;

public class ShuffleArray1 {
    static int[] MixArray(int[] a, int n){

        int[] arr = new int[n*2];
        int l = 2*n;
        for (int i = 0; i < n  ; i++) {

            arr[2*i] = a[i];

            arr[(2*i)+1] = a[n];

            n++;

            if (n==l){
                break;

            }

         //   i--;

        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,4,3,2,1};
        int n = arr.length/2;

        System.out.println(Arrays.toString(MixArray(arr,n)));
    }
}
