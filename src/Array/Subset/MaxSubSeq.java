package Array.Subset;

//Given an array arr[] of N integers and another integer K.
// The task is to find the maximum sum of a subsequence such that the difference of the indices of all
// consecutive elements in the subsequence in the original array is exactly K.
// For example, if arr[i] is the first element of the subsequence then the next element has to be arr[i + k]
// then arr[i + 2k] and so on.


public class MaxSubSeq {

    static int maximum(int[]ar, int n,int k,int i){
        int maxsum=Integer.MIN_VALUE;
        int currsum=0;

        while(i < n){

            currsum = currsum + ar[i];

            if(maxsum < currsum){
                maxsum=currsum;
            }
            if (currsum<0){
                currsum = 0;
            }
            i+=k;

        }


        return maxsum;
    }

    static int find(int[] ar, int n, int k){

        int max = 0 ;

        for (int i = 0; i <= Math.min(n,k); i++) {


            max = Math.max(max, maximum(ar,n,k,i));
        }

        return max;
    }


    public static void main(String[] args) {
        int[] ar = {2, -3, -1, -1, 2};
        int k = 2;
        int n = ar.length;
        System.out.println(find(ar,n,k));
    }
}
