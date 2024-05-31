package Array;

import java.util.Arrays;

public class evenndoddAry {
    static int[] arrayEvennOdd(int[] ar, int n){
        int[] a;
        a = new int[n];
        int index = 0;
        for (int i = 0; i < n; i++) {
            if (ar[i] % 2 == 0) {
                a[index++] = ar[i];
//                index++;

            }
        }
        for (int i = 0; i < n; i++) {
            if (ar[i]%2!=0){
                a[index++] = ar[i];
//                index++;
            }
        }

        return a;
    }

    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        int n = a.length;

        System.out.println(Arrays.toString(arrayEvennOdd(a,n)));
    }
}
