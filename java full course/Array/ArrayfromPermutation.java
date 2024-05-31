package Array;
import java.util.*;
//public class ArrayfromPermutation {
//    public static void main(String[] args) {
////        Scanner in = new Scanner(System.in);
////        int num = in.nextInt();
////        System.out.println(buildarray(num[]));
//        int[] nums = {5,0,1,2,3,4};
//        System.out.println(Arrays.toString(buildarray(nums)));
//
//    }
//    static int[] buildarray(int[] nums){
//        int length = nums.length;
//        int[] ans = new int[length];
//        for(int i =0; i<length; i++){
//            ans[i] = nums[nums[i]];
//
//        }
//        return ans;
//    }
//}
public class ArrayfromPermutation {
    public static int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];
        //int temp = 0;
        if(nums.length < 1){
            return nums;
        }

        for(int i=0; i<nums.length; i++){
            ans[i] = nums[nums[i]];
        }
        return ans;


    }
    public static void main(String[] args){
        int[] nums = {0,2,1,5,3,4};
        System.out.println(Arrays.toString(buildArray(nums)));
    }
}