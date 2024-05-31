package Array;

import java.util.Arrays;

public class TargetArray {
    static int[] createTargetArray(int[] nums, int[] index) {
//        int[] a = new int[nums.length];
//
//            for (int i = 0; i < a.length; i++) {
//
//
//                    a[index[i]] = nums[i];
//
//
//
//
//
//        }
//
//
//
//        return a;
//        }
        int[] target = new int[nums.length];
        int i = 0, k = 0;
        while (i < index.length) {
            for (k = target.length - 1; k > index[i]; k--)
                target[k] = target[k - 1];
            target[index[i]] = nums[i];
            i++;
        }
        return target;
    }

    public static void main(String[] args) {
        int[] nums = {0,1,2,3,4};
        int[] index = {0,1,2,2,1};
        System.out.println(Arrays.toString(createTargetArray(nums,index)));
    }


}

