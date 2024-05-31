package Recursion;

import java.util.Arrays;

public class bubbleSort {
     static int[] bs(int[] ar, int index){
        if(index<=0){
            return ar;

        }
        for (int i = 0; i < ar.length-1; i++) {


            if (ar[i] > ar[i + 1]) {
                int temp = ar[i];
                ar[i] = ar[i + 1];
                ar[i + 1] = temp;
            }
        }
         return bs(ar, index-1);

    }

    public static void main(String[] args) {
        int[] ar = {7,8,5,3,10,1,4};
        ;
        System.out.println(Arrays.toString(bs(ar,ar.length-1)));
    }
}
