package Practice.Array;

import java.util.HashSet;

public class duplicate {

    public static boolean dup(int[] nums){

        HashSet<Integer> ele = new HashSet<>();

        for (int el: nums) {

            if(ele.contains(el)){
                return true;
            }
            ele.add(el);

        }
        return false;

    }

    public static void main(String[] args) {
        int[] ar = {1,2,3,4};
        System.out.println(dup(ar));
    }
}
