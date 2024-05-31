package Array;

import java.util.ArrayList;
import java.util.Arrays;

public class ShuffleArray {
    public static void main(String[] args) {
        int[] arr = {2,5,1,3,4,7};
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(resArr(arr)));

    }
    static int[] resArr(int[] num){
        int[] ans = new int[num.length];

        System.out.println(Arrays.toString(ans));

        for(int i = 0; i<num.length; i++){
            if(i>num.length/2){
              int temp = ans[i-2];
              ans[i-2] = ans[i];
              ans[i] = temp;

              System.out.println(Arrays.toString(ans));

            }
        }
        return ans;
    }
}
