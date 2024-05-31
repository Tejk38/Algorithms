package Array;


// find second largest element in the array.
public class FSLE {
    static int largestelement(int[] ar){
        int max = ar[0];
        int idx = 0;
        for (int i = 0; i < ar.length  ; i++) {
            if(ar[i]>max){
//                max = ar[i];
                idx = i;
            }

        }
        ar[idx] = 0;

        for (int i = 0; i < ar.length ; i++) {
            if (ar[i]>max){
                max = ar[i];
            }

        }
        return max;
    }
//
//    public int[] swap(int[] ar, int i, int j){
//        int temp = ar[i];
//
//    }

    public static void main(String[] args) {
        int[] ar = {12, 35, 1, 10, 34, 1};
        System.out.println(largestelement(ar));
    }
}
