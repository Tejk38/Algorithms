package SortingAlgo;

import java.util.List;

public class FindDupilcates {
    public static void main(String[] args) {

    }
    static int duplicates(int[] arr){
        int i = 0;
        while(arr[i]<arr.length){

            if (arr[i] != i + 1) {
                int correct = arr[i] - 1;
                if (arr[i] != arr[correct]) {
                    swap(arr, i , correct);
                } else {
                    return arr[i];
                }
            } else {
                i++;
            }
        }
        return -1;
    }

    static void swap(int[] ar, int first, int second){
        int temp = ar[first];
        ar[first] = ar[second];
        ar[second] = temp;
    }

}
