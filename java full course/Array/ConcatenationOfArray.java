package Array;

import java.util.Arrays;

//public class ConcatenationOfArray {
//    public static void main(String[] args) {
//        int[] num = {1,2,3};
//
//        System.out.println(Arrays.toString(conc(num)));
//
//    }
//    static int[] conc(int[] nums){
//        int l = nums.length;
//        int[] a = new int[2*l];
//        for (int i = 0; i < l; i++) {
//            a[i] = nums[i];
//            a[i+l] = nums[i];
//
//        }
//
//
//
//
//        return a;
//
//    }
//}
public class ConcatenationOfArray {
    public static int[] getConcatenation(int[] nums) {
        int[] res = new int[2*(nums.length)];
        for(int i = 0; i<nums.length;i++){
            res[i] = nums[i];
            res[nums.length+i] = nums[i];
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {1,3,2,1};
        System.out.println(Arrays.toString(getConcatenation(nums)));
    }
}









