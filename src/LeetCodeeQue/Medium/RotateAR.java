package LeetCodeeQue.Medium;

//https://leetcode.com/problems/rotate-array/?envType=study-plan-v2&envId=top-interview-150

import java.util.Arrays;

public class RotateAR {

//    public static void rotate(int[] nums,int k){
//
//        while (k>0) {
//            int i = 0, j = nums.length - 2;
//            int temp = nums[j + 1];
//            while (j>=0) {
//                nums[j + 1] = nums[j];
//                j--;
//            }
//            nums[i] = temp;
//            j = nums.length-2;
//            k--;
//        }
//        System.out.println(Arrays.toString(nums));

    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        k %= n; // In case k is greater than the length of the array

        // Reverse the entire array
        reverse(nums, 0, n - 1);

        // Reverse the first k elements
        reverse(nums, 0, k - 1);

        // Reverse the remaining elements
        reverse(nums, k, n - 1);
    }

    private static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }



    public static void main(String[] args) {
        int[] ar = {1,2,3,4,5,6,7};
        int k = 3;
        rotate(ar,k);
//        System.out.println(Arrays.toString());
    }

}
