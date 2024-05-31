package LeetCodeeQue.Easy;

import java.util.ArrayList;
import java.util.Arrays;

public class HighestAltitude {
    static int height(int[] gain){
        int[] ar = new int[gain.length+1];
        ar[0] = 0;
        for(int i=1;i<ar.length;i++){
            System.out.println(ar[i-1]);
            ar[i] = ar[i-1]+gain[i-1];

        }
        System.out.println(Arrays.toString(ar));
        int max = ar[0];
        for(int i:ar){
            if(i>max){
                max = i;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] ar = {-5,1,5,0,-7};
        System.out.println(height(ar));
    }
}
