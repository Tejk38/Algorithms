package Array.Subset;


import java.util.Arrays;

//Given an array of N numbers where a subarray is sorted in descending order and rest of the numbers in
// the array are in ascending order.
// The task is to sort an array where a subarray of a sorted array is in reversed order.
public class SortSubsetOfRevArray {
    public static int[] sortRevArr(int[]ar,int n){

        int s=-1,e=-1;
        for (int i = 1; i < n; i++) {

            if(ar[i]<ar[i-1]){
                s = i-1;
                break;
            }
            s++;

        }
        for (int i = n-2; i >0 ; i--) {

            if(ar[i]>ar[i+1]){
                e=i+1;
                break;

            }

        }

        if(s==-1&&e==-1){
            System.out.println("not found");
        }

        while(s<=e){
            int temp = ar[e];
            ar[e] = ar[s];
            ar[s] = temp;

            s++;
            e--;

        }

        return ar;
    }

    public static void main(String[] args) {

        int[]ar = {1,2,3,6,5,4,7};
        int n = ar.length;
        System.out.println(Arrays.toString(sortRevArr(ar,n)));
    }




}
