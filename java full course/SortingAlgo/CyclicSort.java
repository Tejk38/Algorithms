package SortingAlgo;

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr= {8,7,4,1,2,6,3,5};
        Csort(arr);
        System.out.println(Arrays.toString(arr));


    }
    static void Csort(int[] ar){

        int i = 0;
        while(i<ar.length){
            int correct = ar[i]-1;
            if(ar[i]!=ar[correct]) {
                swap(ar,i, correct);

            }else{
                i++;
            }
        }


    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first]  = arr[second];
        arr[second] = temp;
    }
}
