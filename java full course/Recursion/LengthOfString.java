package Recursion;

import Array.Arraylist;

import java.util.ArrayList;

//import static java.lang.StringUTF16.charAt;

public class LengthOfString  {
    static ArrayList<String> st = new ArrayList<>();
    static int length(String s, int count, int index){
        if(s.charAt(index) == 0){
            return count;

        }
        else {
            return length(s, count + 1, index + 1);
        }

    }

    public static void main(String[] args) {
        String s = "abcd";
        System.out.println(length(s,0,0));
    }
}
