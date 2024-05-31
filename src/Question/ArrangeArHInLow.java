package Question;


import java.util.Arrays;

//given a sorted array rearrange the array such that after every max element there is a min number.
public class ArrangeArHInLow {

    static int[] arrange(int[] ar, int size){
        int[] result = new int[size];
        int low = 0;
        int high = size - 1;
        int idx = 0;

        for (int i = 0; i < size; i++) {
            if (i % 2 == 0) {
                result[i] = ar[high];
                high--;
            } else {
                result[i] = ar[low];
                low++;
            }
        }

        return result;
    }



    public static void main(String[] args) {
        int[] ar = new int[10000];
        for (int i = 0; i < 10000; i++) {
            ar[i] = i+1;
        }

        int size = ar.length;

        System.out.println(Arrays.toString(arrange(ar,size)));

    }
}
