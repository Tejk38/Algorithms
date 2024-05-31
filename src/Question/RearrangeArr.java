package Question;

//Rearrange array such that ar[i] = i
// if element is not present print -1

import java.util.Arrays;

public class RearrangeArr {

    static int[] arrange(int[] ar, int size){

        int[] a = new int[size];

        for (int i = 0; i < size; i++) {

            if(ar[i] != -1 && ar[ar[i]] !=-1){
                int temp = ar[i];
                ar[i] = i;
                ar[temp] = temp;
            }
            else {
                ar[i] = -1;
            }

        }
        return ar;
    }

    public static void main(String[] args) {
        int[] ar = {-1, -1, 6, 1, 9, 3, 2, -1, 4, -1};
        System.out.println(Arrays.toString(arrange(ar,ar.length)));
    }
}
