package Array;

import java.util.Arrays;

// Given an array and integer, return an array sum of number in array and given number.


/*
a = [1,2,3]
b = 5
a = [1,2,8]
 */
public class AddToArrayFormInteger {
    static int[] arrayform(int[] ar, int k) {
        int num = 0;


        for (int i = 0; i < ar.length; i++) {

            num = (num*10)+ ar[i];


        }

        num += k;


        int i = ar.length - 1;
        int sum = 0;
        while (num > 0) {
            sum = num%10;

            num = num/10;

            ar[i] = sum;

            i--;

        }
        return ar;


    }

    public static void main(String[] args) {
        int[] ar = {1,2,3};
        int k = 2;

        System.out.println(Arrays.toString(arrayform(ar,k)));
    }
}
