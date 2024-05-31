package LeetCodeeQue.Medium;

// Given an array of 1's and 0's return the maximum number of consecutive 1's
// we can flip k number of 0's to 1's if required

public class MaxConsecutive1s {
    static int maxones(int[] nums, int k){
        int i = 0,left = 0, maxcount=0, zerocount=0;
        for (int right = 0; right < nums.length; right++) {


            if (nums[right] == 0) {
                zerocount++;
            }
            while (zerocount > k) {
                if (nums[left] == 0) {
                    zerocount--;
                }
                left++;
            }
            maxcount = Math.max(maxcount, right - left + 1);
        }


        return maxcount;
    }

    public static void main(String[] args) {
        int[] ar = {0,0,1,1,1,0,0};
        int k = 0;
        System.out.println(maxones(ar,k));
    }

}
