package Linear_Search;

import java.util.Arrays;

public class targetEInd {

    static int[] searchRange(int[] ar, int target) {
        int[] result = new int[2];
        result[0] = findfirst(ar, target);
        result[1] = findlast(ar, target);
        return result;
    }


    static int findfirst(int[] ar, int target) {
        int start = 0;
        int end = ar.length - 1;
        int idx = -1;
        while (end >= start) {
            int mid = start + (end - start) / 2;

            if (ar[mid] >= target) {
                end = mid - 1;

            }
            if (ar[mid] < target) {
                start = mid + 1;

            }
            if (ar[mid] == target) {
                idx = mid;
            }


        }
        return idx;


    }
    static int findlast(int[] ar, int target) {
        int start = 0;
        int end = ar.length - 1;
        int idx = -1;
        while (end >= start) {
            int mid = start + (end - start) / 2;

            if (ar[mid] <= target) {
                start = mid + 1;

            }
            if (ar[mid] > target) {
                end = mid - 1;

            }
            if (ar[mid] == target) {
                return mid;
            }


        }
        return -1;


    }

    public static void main(String[] args) {
        int[] ar = {5,7,7,8,8,10};
        int target = 8;
        System.out.println(Arrays.toString(searchRange(ar,target)));
    }
}



