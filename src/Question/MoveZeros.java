package Question;

import java.util.Arrays;

//Move all zeroes to the end

//the idea is to declare and initialize count such that for every positive number(<0) is incremented and later
// it is swapped with the element
public class MoveZeros {

    static int[] zero(int[] ar,int size){

        int count = 0;

        for (int i = 0; i < size; i++) {

            if(ar[i]>0){
                int temp = ar[count];
                ar[count] = ar[i];
                ar[i] = temp;
                count++;
            }


        }
        return ar;
    }

    public static void main(String[] args) {
        int[] ar =  {1, 2, 0, 4, 3, 0, 5, 0};
        int size = ar.length;

        System.out.println(Arrays.toString(zero(ar,size)));
    }
}
