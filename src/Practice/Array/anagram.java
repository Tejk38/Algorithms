package Practice.Array;

//https://leetcode.com/problems/valid-anagram/description/

import java.util.HashMap;
import java.util.Map;

public class anagram {

    public static boolean anagram(String s, String t){

        Map<Character, Integer> count= new HashMap<>();

        for (char x: s.toCharArray()) {
            count.put(x, count.getOrDefault(x,0)+1);
        }

        for (char x: t.toCharArray()) {
            count.put(x, count.getOrDefault(x,0)-1);
        }

        for ( int val:
                count.values()) {
            if(val!=0){
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args) {
        String s = "rat";
        String t = "trap";

        System.out.println(anagram(s,t));
    }

}
