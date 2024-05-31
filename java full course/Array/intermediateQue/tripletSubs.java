package Array.intermediateQue;

// find triplets that equal to the given target.

import java.util.ArrayList;

public class tripletSubs {

    static boolean check(int n, int[] ar, int target, ArrayList<Integer> list){

        if(target == 0 && list.size()==3){
            System.out.println(list.get(0)+" "+list.get(1)+" "+list.get(2));

        }
        if(n==0 || target < 0|| list.size()==3){
            return false;
        }

        list.add(ar[n-1]);

        boolean a = check(n-1, ar, target - ar[n-1], list);

        list.remove(list.size()-1);

        boolean b = check(n-1,ar,target,list);

        return a | b;
    }

    public static void main(String[] args) {
        // array length
        int n = 6;

        // array
        int[] arr = {1, 4, 45, 6, 10, 8};

        // target value
        int target = 22;

        // taking empty array for triplet
        ArrayList<Integer> triplet = new ArrayList<>();

        // calling function
        if (!check(n, arr, target, triplet)) {
            System.out.println("does not exist");
        }
    }


}
