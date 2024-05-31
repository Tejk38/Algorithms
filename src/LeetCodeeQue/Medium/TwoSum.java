package LeetCodeeQue.Medium;

import java.util.Arrays;

public class TwoSum {

    public static int[] twosum(int[] ar, int target){
        int s = 0, e = ar.length-1;

        while (e>s){
            int sum = ar[s]+ar[e];

            if(sum==target){
                return new int[]{s+1,e+1};

            } else if (sum>target) {
                e--;
            }
            else {
                s++;
            }


        }
        return new int[]{-1,-1};
    }

    public static void main(String[] args) {
        int[] ar= {-1,0};
        System.out.println(Arrays.toString(twosum(ar,-1)));

    }

}
