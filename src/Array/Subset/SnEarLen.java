package Array.Subset;

import java.util.ArrayList;
import java.util.HashMap;

//find the length of subarray with same first element.
public class SnEarLen {

//    static int len(char[] ar, int n, int s, int e, int count) {
//        if (e == n) {
//            return count;
//        } else if (s > e) {
//            return len(ar, n, 0, e + 1, count);
//        } else {
//            ArrayList<Character> a = new ArrayList<>();
//            for (int i = s; i <= e; i++) {
//                a.add(ar[i]);
//            }
//            if (a.size() > count && a.get(0) == a.get(a.size() - 1)) {
//                count = a.size();
//            }
//            return len(ar, n, s + 1, e, count);
//        }
//    }
//
//
//    public static void main(String[] args) {
//
//        char[] a = {'a','b','c','d','a'};
//        System.out.print(len(a,a.length,0,0,0));
//
//
//
//    }






        static int maxLength(char[] arr, int n) {
            HashMap<Character, Integer> map = new HashMap<>();
            int maxLength = 0;
            int currentLength = 0;

            for (int i = 0; i < n; i++) {
                if (map.containsKey(arr[i]) && map.get(arr[i]) >= currentLength) {
                    currentLength = i - map.get(arr[i]);
                } else {
                    currentLength++;
                }

                map.put(arr[i], i);
                maxLength = Math.max(maxLength, currentLength);
            }

            return maxLength;
        }

        public static void main(String[] args) {
            char[] arr = {'g', 'e', 'e', 'k', 's'};
            int n = arr.length;
            System.out.print(maxLength(arr, n));
        }
    }



