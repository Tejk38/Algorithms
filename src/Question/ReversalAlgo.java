package Question;

import java.util.Arrays;

//sort the array such that every element is moved left by a given num
public class ReversalAlgo {

    static int[] sort(int[] ar,int size, int d){
        int[] res = new int[size];
        for (int i = 0; i < size; i++) {

            int tmp=i-d;
//            System.out.println(tmp);
            if(tmp<0){
                res[size+tmp] = ar[i];
            }
            else {
                res[tmp] = ar[i];
            }
            
        }
        return res;
    }

    public static void main(String[] args) {
        int[] ar = {1,6,7,8};
        int d = 3;
        System.out.println(Arrays.toString(sort(ar,ar.length,d)));
    }
}

