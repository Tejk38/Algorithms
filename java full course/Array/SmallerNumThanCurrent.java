package Array;

import java.util.Arrays;

public class SmallerNumThanCurrent {
    static int[] smallerNumbersThanCurrent(int[] nums){
        int count = 0;
        int[] a = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {

                if(nums[j] < nums[i] ){
                    count++;
                }


            }
            a[i] = count;
            count = 0;

        }
        return a;
    }

    public static void main(String[] args) {
        int[] arr = {6,5,4,8};
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(arr)));
    }
}
