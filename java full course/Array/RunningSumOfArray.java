package Array;

import java.util.Arrays;

public class RunningSumOfArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        System.out.println(Arrays.toString(res(arr)));
    }
    static int[] res(int[] nums){
        int[] ans = new int[nums.length];

        for(int i = 0; i<nums.length; i++){
            for (int j = 0; j <= i ; j++) {

                ans[i] = ans[i] + nums[j];

            }



           }

        return ans;
    }
}
