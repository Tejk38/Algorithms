package SortingAlgo;

import java.util.Arrays;

public class Bubblesort  {
    static void bs(int[] ar){
        int l = ar.length;
        while(l>=0){
            for (int i = 0; i < l-1; i++) {
                if(ar[i]>ar[i+1]){
                    int temp = ar[i];
                    ar[i] = ar[i+1];
                    ar[i+1] = temp;
                }

            }
            l--;

        }
        System.out.println(Arrays.toString(ar));
    }
    static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;

    }

    public static void main(String[] args) {
        int[] ar = {5,3,4,1,2};
        bs(ar);

    }
}
