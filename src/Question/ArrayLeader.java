package Question;

//Array leaders are those elements whose elements to the right are less than the current element.

//Efficient approach: traverse from right side and if print element when there is a max element
public class ArrayLeader {

    static void leader(int[] ar, int size){

        int max = ar[size-1];
        System.out.print(max+" ");
        for (int i = size-2; i >= 0 ; i--) {

            if(ar[i]>max){
                max = ar[i];
                System.out.print(max+" ");


            }



        }


    }

    public static void main(String[] args) {
        int[] ar = {16, 17, 4, 3, 5, 2};

        leader(ar,ar.length);
    }

}
