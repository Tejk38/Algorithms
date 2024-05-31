package BinarySearch;

import org.jetbrains.annotations.Contract;

public class OrderAgnosticBS {
    public static void main(String[] args) {
       // int[] arr = {-5,-1,2,3,4,16,18,22,28,45};
        int[] arr = {99,45,33,22,4};
        int target = 22;
        int ans = orderAgnosticBS(arr,target);
        System.out.println(ans);

    }


    static int orderAgnosticBS(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {

            //find middle element

            //  int mid = (start+end)/2; // might be possible that (start+end) exceeds the range of integers in java.
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else if (target > arr[mid]) {
                    start = mid + 1;
                }
            }
                else {
                    if (target > arr[mid]) {
                        end = mid - 1;
                    } else if (target < arr[mid]) {
                        start = mid + 1;
                    }
                }

            }



        return -1;

    }
}

