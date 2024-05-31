package Array.Sorting;

import java.util.Arrays;

public class InsertionSort {

    static int[] srt(int[] ar, int size){
//        int min = ar[0];
        for (int i = 1; i < size; i++) {

            for (int j = i; j >0 ; j--) {

                if(ar[j]<ar[j-1]){
                    int temp = ar[j];
                    ar[j] = ar[j-1];
                    ar[j-1] = temp;
                }

            }
            System.out.println(Arrays.toString(ar));


        }
        return ar;
    }

    public static void main(String[] args) {
        int[] ar = {4,2,1,3,5};
        int size = ar.length;

        System.out.println(Arrays.toString(srt(ar,size)));
    }
}
