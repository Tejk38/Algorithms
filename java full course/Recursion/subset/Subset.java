package Recursion.subset;



import java.util.*;

public class Subset {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        List<List<Integer>> ans = seq(arr);
        for (List<Integer> List:
             ans) {
            System.out.println(List);

        }

    }
    static List<List<Integer>> seq(int[] ar) {
        List<List<Integer>> outer = new ArrayList<>();

        outer.add(new ArrayList<>()); // creating an empty array list inside the outer list

        for (int num:
             ar) {
            int n = outer.size();
            System.out.println(n);
            for (int i = 0; i < n; i++) {
                List<Integer> internal = new ArrayList<>(outer.get(i));// this step creates exact duplicates of  the already existing internally list in the outer list.
                internal.add(num); // now we just add the current number to all the internal list duplicates in the outer array.
                outer.add(internal); // finally add all the internal arrays to the outer list.

            }

        }

        return outer;
    }
    static List<List<Integer>> seqduplicate(int[] ar){
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());

        int n = outer.size();

        int start = 0;
        int end = 0;
        for (int i = 0; i < ar.length; i++) {
            start = 0;
            if (i>0 && ar[i] == ar[i-1]){
                start = end+1;
            }
            end = n-1;

            for (int j = start; j < n; j++) {

                List<Integer> internal = new ArrayList<>(outer.get(j));

                internal.add(ar[i]);

                outer.add(internal);

            }


        }
        return outer;

    }
}
