package Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum {
    static List<List<Integer>> combi(int[] ar, int target){
        List<List<Integer>> combinations = new ArrayList<>();
        List<Integer> currentCombination = new ArrayList<>();
        backtrack(ar, target, 0, currentCombination, combinations);
        return combinations;
    }
    public static void backtrack(int[] candidates, int target, int index, List<Integer> currentcombination, List<List<Integer>> combination){

        if(target < 0){
            return;

        }
        if (target ==0){
            combination.add(new ArrayList<>(currentcombination));
            return;
        }
        for (int i = index; i < candidates.length ; i++) {
            currentcombination.add(candidates[i]);
            backtrack(candidates, target - candidates[i], i, currentcombination,combination);
            currentcombination.remove(currentcombination.size()-1);
        }


    }


}
