package SortingAlgo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class findAllMissingNumbers {


    public static void main(String[] args) {
        int[] ar = {4,3,2,7,8,2,3,1};
        System.out.println(findDissappearedNumbers(ar));

    }
    public static List<Integer> findDissappearedNumbers(int[] ar) {




            int i = 0;
            while (i < ar.length) {
                int correct = ar[i]-1;
                if ( i < ar.length && ar[i] != ar[correct]) {
                    swap(ar, i, correct);

                } else {
                    i++;
                }
            }
          // find
            List<Integer> ans = new ArrayList<>();
            for (int index = 0; index < ar.length ; index++) {
                if(ar[index]!=index+1){
                    ans.add(index+1);
                }

        }
            return ans;
        }


        static void swap(int[] arr, int first, int second){
            int temp = arr[first];
            arr[first]  = arr[second];
            arr[second] = temp;
        }
}
