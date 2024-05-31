package Array.Sorting;

import java.util.*;
public class MergeSort {

    static int[] mergesort(int[] ar){
        if(ar.length==1){
            return ar;
        }
        int mid = ar.length/2;
        int[] l = mergesort(Arrays.copyOfRange(ar,0, mid));
        int[] r = mergesort(Arrays.copyOfRange(ar,mid,ar.length));

        return merge(l,r);
    }

    static int[] merge(int[] l, int[] r){

        int[] mix = new int[l.length+r.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i< l.length && j<r.length){

            if (l[i] < r[j]) {
                mix[k] = l[i];
                i++;

            }
            else {
                mix[k] = r[j];
                j++;
            }
            k++;

        }

        while(i<l.length){
            mix[k] = l[i];
            i++;
            k++;
        }

        while(j < r.length){
            mix[k] = r[j];
            j++;
            k++;
        }
        return mix;
    }

    public static void main(String[] args) {
        int[] ar = {4,5,3,1,2};
        System.out.println(Arrays.toString(mergesort(ar)));

    }
}
