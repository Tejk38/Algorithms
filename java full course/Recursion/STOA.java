package Recursion;

import java.util.Arrays;

public class STOA {
    public static void main(String[] args) {
        int[] ar = {1,2,3,4,5};

        PrintTriangle(ar);

        System.out.println(Arrays.toString(ar));

    }
    static void PrintTriangle(int[] ar){
        if(ar.length==1){
            return;
        }
        else{
            int[] temp = new int[ar.length-1];
            helper(ar,temp,0);

            PrintTriangle(temp);
            System.out.println(Arrays.toString(temp));

        }

    }
    static int[] helper(int[] ar, int[] temp, int index){
        if (index == ar.length-1){
            return temp;
        }
        else {
            temp[index] = ar[index]+ar[index+1];
            helper(ar,temp,index+1);

        }
        return temp;

    }



}
