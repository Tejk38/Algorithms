package Array.Matrix;

import java.util.HashMap;
import java.util.Map;

//find an element in a sorted matrix
public class SearchSortedMat {

    // using linear mapping to find the element
    // time complexity:O(n+m), space complexity = O(n+m);
    static void ele(int[][] mat, int n, int m, int k){

        Map<Integer, int[]> mp = new HashMap<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                if (mat[i][j] == k){

                    System.out.println("found at"+"("+i+","+j+")");
                }

                mp.put(mat[i][j], new int[] {i,j});


            }
        }


        // check coords

        if (mp.containsKey(k)){
            int[] idx = mp.get(k);

            System.out.println("("+idx[0]+","+idx[1]+")");

        }
        else {
            System.out.println("coords not found");
        }


    }
    // time:O(log n + log m)
    static void findRow(int[][] a, int n, int m, int k)
    {
        int l = 0, r = n - 1, mid;

        while (l <= r) {
            mid = (l + r) / 2;

            // we'll check the left and
            // right most elements
            // of the row here itself
            // for efficiency
            if (k == a[mid][0]) // checking leftmost element
            {
                System.out.println("Found at (" + mid + ","
                        + "0)");
                return;
            }

            if (k == a[mid][m - 1]) // checking rightmost
            // element
            {
                int t = m - 1;
                System.out.println("Found at (" + mid + ","
                        + t + ")");
                return;
            }

            if (k > a[mid][0]
                    && k < a[mid]
                    [m - 1]) // this means the element
            // must be within this row
            {
                binarySearch(a, n, m, k,
                        mid); // we'll apply binary
                // search on this row
                return;
            }

            if (k < a[mid][0])
                r = mid - 1;
            if (k > a[mid][m - 1])
                l = mid + 1;
        }
    }

    static void binarySearch(int[][] a, int n, int m, int k,
                             int x) // x is the row number
    {
        // now we simply have to apply binary search as we
        // did in a 1-D array, for the elements in row
        // number
        // x

        int l = 0, r = m - 1, mid;
        while (l <= r) {
            mid = (l + r) / 2;

            if (a[x][mid] == k) {
                System.out.println("Found at (" + x + ","
                        + mid + ")");
                return;
            }

            if (a[x][mid] > k)
                r = mid - 1;
            if (a[x][mid] < k)
                l = mid + 1;
        }
        System.out.println("Element not found");
    }



    public static void main(String[] args) {
        int[][] ar = {{0, 6, 8, 9, 11},
                {20, 22, 28, 29, 31},
                {36, 38, 50, 61, 63},
                {64, 66, 100, 122, 128}};
        int k = 8;
        findRow(ar,4,5,k);
    }


}
