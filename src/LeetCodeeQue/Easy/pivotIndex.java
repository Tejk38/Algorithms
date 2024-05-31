package LeetCodeeQue.Easy;

public class pivotIndex {
    static int index(int[] nums){

            int totalSum = 0;
            int leftSum = 0;

            // Calculate the total sum of all elements in the array
            for (int num : nums) {
                totalSum += num;
            }

            for (int i = 0; i < nums.length; i++) {
                // Check if the left sum is equal to the total sum minus the current element and the left sum
                if (leftSum == totalSum - nums[i] - leftSum) {
                    return i;
                }

                // Update the left sum by adding the current element
                leftSum += nums[i];
            }

            // If no equilibrium index is found, return -1
            return -1;


    }

    public static void main(String[] args) {
        int[] ar = {1,7,3,6,5,6};
        System.out.println(index(ar));
    }
}
