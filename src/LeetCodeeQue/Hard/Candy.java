package LeetCodeeQue.Hard;

import java.util.Arrays;

//https://leetcode.com/problems/candy/?envType=study-plan-v2&envId=top-interview-150
public class Candy {
    // Atleast one candy for one child
    // check prev ar element if greater than curr
    // if yes, give 1 extra candy
    // else only 1.

    public static int candy(int[] ratings){
        int n = ratings.length;
        int[] candy = new int[n];

        Arrays.fill(candy,1);

        for (int i = 1; i < ratings.length; i++) {
            // going from left to right
            if (ratings[i] > ratings[i - 1]) {
                candy[i] = candy[i - 1] + 1;
            }
        }
        for (int i = ratings.length-2; i >=0 ; i--) {
            // going from right to left checking the elements on the right side of the element
            if(ratings[i]>ratings[i+1] && candy[i]<=candy[i+1]){
                candy[i] = candy[i+1]+1;
            }
        }
        int count = 0;
        for (int choc:candy) {
            count+=choc;
        }

        return count;
    }

    public static void main(String[] args) {
        int[] ar = {1,0,2};
        System.out.println(candy(ar));
    }

}
