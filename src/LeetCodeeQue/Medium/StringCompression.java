package LeetCodeeQue.Medium;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/string-compression/?envType=study-plan-v2&envId=leetcode-75
public class StringCompression {
        static int compress(char[] ar){

            int count = 1;
            StringBuilder compressedstring = new StringBuilder();
            for (int i = 1; i < ar.length; i++) {
                if(i<ar.length&&ar[i]==ar[i-1]){
                    count++;
                }
                else {
                    compressedstring.append(ar[i-1]);
                    if(count>1){
                        compressedstring.append(count);
                    }
                    count = 1;
                }

            }
            // this is the case where last repeated element is not appended to the string so we appended it now
            compressedstring.append(ar[ar.length-1]);
            if(count>1){
                compressedstring.append(count);
            }

            String s = compressedstring.toString();




            return s.length();
        }
//    static int compression(char[] ar) {
//        Map<Character, Integer> mp = new HashMap<>();
//        int compressedLength = 0;  // Initialize the length of compressed string
//
//        for (int i = 0; i < ar.length; i++) {
//            if (mp.containsKey(ar[i])) {
//                int freq = mp.get(ar[i]);
//                freq++;
//                mp.put(ar[i], freq);
//            } else {
//                mp.put(ar[i], 1);
//            }
//        }
//
//        // Append characters and their counts to the compressed string
//        StringBuilder compressedString = new StringBuilder();
//        for (Map.Entry<Character, Integer> entry : mp.entrySet()) {
//            compressedString.append(entry.getKey());
//            if (entry.getValue() > 0) {
//                compressedString.append(entry.getValue());
//            }
//        }
//        char[] compressedArray = compressedString.toString().toCharArray();
//        System.out.println(Arrays.toString(compressedArray));
//
//        // Copy the compressed string back to the input array
////        char[] compressedArray = compressedString.toString().toCharArray();
////        System.arraycopy(compressedArray, 0, ar, 0, compressedArray.length);
//
//        return compressedArray.length;
//    }

    public static void main(String[] args) {
        char[] ar = {'a', 'a', 'b', 'b', 'c', 'c', 'c'};
        int compressedLength = compress(ar);
        System.out.println("Compressed Length: " + compressedLength);

        // Print the first 'compressedLength' characters of the modified array

    }
}
