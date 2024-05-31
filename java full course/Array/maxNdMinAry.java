package Array;

import java.util.Arrays;

// arrange the array such that after every
// maximum element there is a minimum element
public class maxNdMinAry {

    static int[] finalar(int[] ar, int n){
        int[] a = ar.clone();

        int small = 0, large = n-1;

        boolean flag = true;

        for (int i = 0; i < n; i++) {
            if(flag)
                a[i] = ar[large--];
            else
                a[i] = ar[small++];

            flag = !flag;
        }
        return a;
    }

    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7};
        int n = a.length;

        System.out.println(Arrays.toString(finalar(a,n)));
    }

}
