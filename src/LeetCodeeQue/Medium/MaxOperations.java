package LeetCodeeQue.Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class MaxOperations {
    static int operations(int[] ar, int target) {
        int count = 0;
        HashMap<Integer, Integer> hp = new HashMap<>();
        ArrayList<Integer> remaining = new ArrayList<>();

        for (int i : ar) {
            int complement = target - i;
            if (hp.containsKey(complement) && hp.get(complement) > 0) {
                count++;
                hp.put(complement, hp.get(complement) - 1);
            } else {
                remaining.add(i);
                hp.put(i, hp.getOrDefault(i, 0) + 1);
            }
        }

        // Copy remaining elements back to the original array
        for (int i = 0; i < remaining.size(); i++) {
            ar[i] = remaining.get(i);
        }
        System.out.println(Arrays.toString(ar));

        return count;
    }

    public static void main(String[] args) {
        int[] ar = {1, 2, 3, 4};
        System.out.println(operations(ar, 5)); // Output: 2

    }
}

