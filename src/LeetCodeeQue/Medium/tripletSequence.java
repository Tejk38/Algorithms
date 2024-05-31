package LeetCodeeQue.Medium;

// return true if there exists a triplet(i,j,k) such that i<j<k and nums[i]<nums[j]<nums[k]
// else return false.

public class tripletSequence {

    static boolean triplet(int[] nums){

        int start = 0, mid = 1, end = 2;
        while(end < nums.length){

            if (nums[start] < nums[mid] && nums[mid] < nums[end]) {
                return true;
            }

            if (nums[start] >= nums[mid]) {
                mid++; // Increment mid when start is greater than or equal to mid
            } else if (nums[mid] >= nums[end]) {
                end++;
            } else {
                start++;
                mid++; // Increment mid when there's no increase in start or end
            }
        }
        return false;

    }

    public static void main(String[] args) {
        int[] num = {5,8,1,0,3,2};
        System.out.println(triplet(num));
    }
}
