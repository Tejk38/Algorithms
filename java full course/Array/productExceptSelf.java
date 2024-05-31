package Array;

/*
{1,2,3,4}
{24,12,8,6}
 */


import java.util.Arrays;

public class productExceptSelf {
    public static int[] prod(int[] ar){
        int[] res = new int[ar.length];
        Arrays.fill(res,1);
        int idx = 0;
//        for (int i = 0; i < ar.length; i++) {
//            res[i] *= ar[idx];
//            if (idx==i){
//                res[i]/=ar[idx];
//
//            }
//            idx=0;
//
//        }
        int i =0;
        while (i<ar.length ){
            res[idx] *= ar[i];
            if (idx==i){
                res[i]/=ar[idx];

            }
            i++;

        }
        return res;
    }

    public static void main(String[] args) {

        int[] ar = {1,2,3,4};
        System.out.println(Arrays.toString(prod(ar)));

    }
}
