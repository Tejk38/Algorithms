package LeetCodeeQue.Medium;

//given an array return max count of consecutive ones and an element should be
// deleted from the array.
public class LongestSubArr1s {
    static int longestSubArray(int[] nums) {
        int left = 0;
        int maxCount = 0;

        int zeroPos = -1;

        for (int right = 0; right < nums.length; right++) {
            if(nums[right]==0){
                if(zeroPos!=-1){
                    left = zeroPos+1;
                }
                zeroPos = right;
            }

            maxCount = Math.max(maxCount, right-left+1);


        }

        return maxCount - 1; // Subtract 1 to account for the removed element.
    }

    public static void main(String[] args) {
        int[] ar = {1, 1, 0, 1, 1, 0, 1, 0};
        System.out.println(longestSubArray(ar));
    }
}
