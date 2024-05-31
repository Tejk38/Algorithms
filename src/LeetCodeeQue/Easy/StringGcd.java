package LeetCodeeQue.Easy;

// find the gcd of 2 strings
// s1 = "abcd" s2 = "abc"
// gcd = "abc"

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class StringGcd {
    static String gcd(String s1, String s2){
        String smaller, larger;

        if(s1.length()-1>s2.length()-1){
            smaller = s2;
            larger = s1;
        }
        else{
            smaller = s1;
            larger = s2;
        }

        Map<Character,Integer> charfreq = new HashMap<>();

//        for (char ch: smaller.toCharArray()) {
//            charfreq.put(ch,charfreq.getOrDefault(ch,0)+1);
//        }
//
//        StringBuilder gcdString = new StringBuilder();
//        //charfreq.containsKey(c) &&
//        for (char c : smaller.toCharArray()) {
//            if (charfreq.get(c) > 0 && larger.contains(String.valueOf(c))) {
//                // Append the character to the resultant string
//                gcdString.append(c);
//                // Decrement the character frequency in both strings
//                charfreq.put(c, charfreq.get(c) - 1);
//            }
//        }


        for (char ch:smaller.toCharArray()) {
            charfreq.put(ch,charfreq.getOrDefault(ch,0)+1);

        }
        StringBuilder gcdString = new StringBuilder();

        for (char ch: smaller.toCharArray()) {
            if(charfreq.get(ch)>0 && larger.contains(String.valueOf(ch))){

                gcdString.append(ch);

                charfreq.put(ch,charfreq.get(ch)-1);
            }
        }



        return gcdString.toString();

    }

    public static void main(String[] args) {
        String s1 = "a good example";
        String s2 = "goodbye";
        String gcd = gcd(s1, s2);
        System.out.println("GCD: " + gcd);

    }
}
