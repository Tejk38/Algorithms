package Recursion;

import java.util.Arrays;

public class SumTriangleFromArray {
    public static void main(String[] args) {
        int[] x = {1,2,3,4,5};

        printTriangle(x);

        System.out.println(Arrays.toString(x));

    }
//    static void printTriangle(int[] x){
//        if(x.length == 1){
//            return;
//
//        }
//        int[] temp = new int[x.length -1];
//        helper(temp, x,0);
//
//        printTriangle(temp);
//        System.out.println(Arrays.toString(temp));
//    }
//    static int[] helper(int[] temp, int[] x, int index){
//        if (index == x.length-1){
//            return temp;
//        }
//        temp[index] = x[index] + x[index+1];
//        return helper(temp, x, index+1);
//
//    }
    public static void printTriangle(int[] ar){
        int[] temp = new int[ar.length-1];
        if(ar.length == 1){
            return;
        }
        for (int i = 0; i < ar.length-1; i++) {
            temp[i] = ar[i]+ar[i+1];

        }

        printTriangle(temp);
        System.out.println(Arrays.toString(temp));


    }













}
