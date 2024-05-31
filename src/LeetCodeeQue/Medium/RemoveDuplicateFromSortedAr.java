package LeetCodeeQue.Medium;

// https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/?envType=study-plan-v2&envId=top-interview-150

import java.util.Arrays;

public class RemoveDuplicateFromSortedAr {
    // idx!=i-2
    public static void duplicate(int[] nums){
        if (nums.length <= 2) {
            return ;
        }

        int uniqueIndex = 2;

        for (int i = 2; i < nums.length; i++) {
            if (nums[i] != nums[uniqueIndex - 2]) {
                nums[uniqueIndex] = nums[i];
                uniqueIndex++;
            }
            System.out.println(Arrays.toString(nums));
        }

//        return uniqueIndex;

    }

    public static void main(String[] args) {
        int[] nums = {1,1,1,2,2,3};

//        System.out.println(Arrays.toString(duplicate(nums)));
        duplicate(nums);
    }

}
