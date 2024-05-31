package LeetCodeeQue.Medium;


import java.util.Arrays;
// given a string reverse it

public class RevString {

    static String reverse(String s){
        String[] d ;

        s.strip();
        d = s.split("\\s+");
        System.out.println(Arrays.toString(d));

        int start = 0, e = d.length-1;
        String temp;

        while(e>=start){
            temp = d[start];
            d[start] = d[e];
            d[e]  = temp;

            e--;
            start++;
        }
        StringBuilder str  = new StringBuilder();
        for (String word: d) {
            if(!word.isEmpty()){
                if(str.length()>0){
                    str.append(" ");
                }
                str.append(word);
            }
        }

        return str.toString();
    }

    public static void main(String[] args) {
        String s = "a good   example";
        System.out.println(reverse(s));
    }

}
