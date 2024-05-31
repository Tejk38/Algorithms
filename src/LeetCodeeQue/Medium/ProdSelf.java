package LeetCodeeQue.Medium;

import java.util.Arrays;


// return a resultant array of product of elements except self.
class ProdSelf {
    public static int[] productExceptSelf(int[] nums) {
        int[] prod = new int[nums.length];
        int leftprod = 1;
        for (int i = 0; i < nums.length; i++) {
            prod[i] = leftprod;
            leftprod *= nums[i];
        }
        int rightprod=1;
        for (int i = nums.length-1; i >= 0 ; i--) {
            prod[i] *= rightprod;
            rightprod *= nums[i];
        }
        return prod;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        System.out.println(Arrays.toString(productExceptSelf(nums)));
    }
}
