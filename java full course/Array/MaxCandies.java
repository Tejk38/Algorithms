package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MaxCandies {

//    static List<Boolean> kidswithGreatest(int[] candies, int exCandies){
//        int l = candies.length;
//        List<Boolean> ans = new ArrayList<>(l);
//        for(int element: candies){
//            ans.add((candies + exCandies) >= Integer.MAX_VALUE);
//
//            }
//
//
//        }
//
//    }
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> ans = new ArrayList<>(candies.length);
        int max = 0;
        for (int candy : candies) {
            max = Math.max(candy, max);
        }
        for (int candy : candies) {
            ans.add(candy + extraCandies >= max);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {2,3,5,1,3};
        int n = 3;
        System.out.println(kidsWithCandies(arr,n));
    }
}
