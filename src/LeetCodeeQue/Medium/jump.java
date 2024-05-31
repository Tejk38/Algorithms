package LeetCodeeQue.Medium;

public class jump {
    public static boolean canJump(int[] nums) {
        int maxReach = 0;
        for (int i = 0; i < nums.length; i++) {
            if(i>maxReach){
                return false;
            }
            maxReach = Math.max(maxReach, i+nums[i]);
        }
        return true;
    }

    public static void main(String[] args) {
        int[] ar = {3,2,1,0,4};
        System.out.println(canJump(ar));
    }
}
