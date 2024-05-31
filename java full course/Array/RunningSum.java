package Array;

import java.util.ArrayList;
import java.util.Arrays;

public class RunningSum {
    static int[] Sum(int[] a){
        int l = a.length;
        int[] arr = new int[l];
        //int e = 0;
//        arr[0] = a[0];
//        for (int i = 0; i < l; ++i) {
//            for (int j = i; j >= 0; j--) {
//
//                arr[i] += a[j];
        arr[0] = a[0];
        int idx = 1;

        for(int i = idx; i>=0;i--){

            arr[idx] = a[idx] + arr[idx-1];



            idx++;
            }

//            a[i] = e;


        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {1,1,1,1,1};
        System.out.println(Arrays.toString(Sum(arr)));
    }
}
