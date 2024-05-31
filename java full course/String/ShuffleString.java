package String;

import java.util.Arrays;

public class ShuffleString {
    static String uns(int[] indices, String s) {
        char temp[] = new char[indices.length];
        for (int i = 0; i < indices.length; i++) {
            temp[indices[i]] = s.charAt(i);
        }
        return new String(temp);
    }
    public static void main(String[] args) {
        String s = "lamamm";
        int[] indices = {5,4,0,1,2,3};
       System.out.println(uns(indices,s));
        uns(indices,s);
    }
}
