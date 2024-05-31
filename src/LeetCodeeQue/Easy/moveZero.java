package LeetCodeeQue.Easy;

//given array, move all the zero element's to the end

import java.util.Arrays;

public class moveZero {

    static int[] move(int[] ar){
        int count = 0,temp = 0;

        for (int i = 0; i < ar.length; i++) {
            if(ar[i] != 0){
                temp = ar[count];
                ar[count] = ar[i];
                ar[i] = temp;
                count++;

            }


        }
        return ar;
    }

    public static void main(String[] args) {
        int[] ar = {0};
        System.out.println(Arrays.toString(move(ar)));
    }

}
