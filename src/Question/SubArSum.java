package Question;

import java.util.ArrayList;

// Find SubArray with target sum
public class SubArSum {

    static ArrayList<Integer> sub(int[] ar, int size, int target) {

        ArrayList<Integer> al = new ArrayList<>();

        int s = 0;
        int e = 0;

        int sum = ar[s];

        while (e < size) {
            if (sum < target) {
                e++;
                if (e < size) {
                    sum += ar[e];
                }
            } else if (sum > target) {
                sum -= ar[s];
                s++;
            } else {
                for (int i = s; i <= e; i++) {
                    al.add(ar[i]);
                }
                return al;
            }
        }

        return new ArrayList<>();
    }

    public static void main(String[] args) {
        int[] ar = {1, 4, 20, 3, 10, 5};
        int target = 33;
        ArrayList<Integer> al = sub(ar, ar.length, target);
        for (int i = 0; i < al.size(); i++) {
            System.out.print(al.get(i) + " ");
        }
    }
}
