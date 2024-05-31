package SortingAlgo;

public class FindMissingNumber {
    public static void main(String[] args) {

        int[] arr = {4,0,2,1};
        System.out.println(missingnumber(arr));


    }
    static int missingnumber(int[] ar) {


        int i = 0;
        while (i < ar.length) {
            int correct = ar[i] ;
            if (ar[i] < ar.length&&ar[i]!=ar[correct]) {
                swap(ar, i, correct);

            } else {
                i++;
            }
        }
        for (int index = 0; index < ar.length ; index++) {
            if(ar[index]!= index){
                return index;
            }


        }
        return ar.length;

    }

    static void swap(int[] arr, int first, int second){
            int temp = arr[first];
            arr[first]  = arr[second];
            arr[second] = temp;
        }
}
