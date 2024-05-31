import java.util.Arrays;

class Solution {
    public static int[] rotate(int[] nums, int k) {
        int l = nums.length-1;
        while(k>0){
            int temp = nums[l];
            for(int i=0; i<nums.length-1; i++){
                int tempf = nums[i+1];
                nums[i+1] = nums[i];


            }
            nums[0] = temp;
            temp = 0;
            k--;
        }
        return nums;

    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        int k = 3;
        System.out.println(Arrays.toString(rotate(nums,k)));
    }
}