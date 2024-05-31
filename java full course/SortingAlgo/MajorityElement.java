package SortingAlgo;
// return element that appears more than n/2 times in the array.
// not complete
public class MajorityElement {
    static int ME(int[] ar){
        int n = ar.length;
        int max = ar[0], count = 1;
        for (int i = 1; i < ar.length-1 ; i++) {
            if (max == ar[i]){
                count++;
            }
            else{
                max = ar[i];

            }

        }
        return max;
    }

    public static void main(String[] args) {
        int[] ar = {3,2,3};
        System.out.println(ME(ar));
    }
}
