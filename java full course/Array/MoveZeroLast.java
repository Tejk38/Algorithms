package Array;


import java.util.Arrays;

// Move all zeroes in the array to the end
//public class MoveZeroLast {
//    static int count = 0;
//    public static int[] mzero(int[] ar){
//
//        for (int i = 0; i < ar.length; i++) {
//
//            if (ar[i]!=0){
//                swap(ar, i, count);
//
//                count++;
//            }
//
//        }
//        return ar;
//
//    }
//    static void swap(int [] ar, int el , int temp2){
//        int temp = ar[el];
//        ar[el] = ar[temp2];
//        ar[temp2] = temp;
//
//
//
//    }
//    public static void main(String[] args) {
//        int[] ar = {1,2,3,0,4,0,0,5};
//        System.out.println(Arrays.toString(mzero(ar)));
//    }
//
//}



public class MoveZeroLast {


    static int[] mzero(int[] ar, int n){
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (ar[i]!=0){
                ar[count++] = ar[i];
            }

        }
        while (count<n){
            ar[count++] = 0;
        }
        return ar;
    }

    public static void main(String[] args) {
        int[] ar = {1,2,0,4,0,5,0};
        int n = ar.length;
        System.out.println(Arrays.toString(mzero(ar,n)));
    }
}
