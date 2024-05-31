package String;
//https://leetcode.com/problems/number-of-strings-that-appear-as-substrings-in-word/
public class StringsInSubStrings {
    static int patterns(String[] seq, String s){
        int count = 0;
        for (int i = 0; i <= seq.length-1 ; i++) {
            for (int j = 0; j <= s.length(); j++) {
                if(seq[j] == s.substring(0,i)){
                    count++;
                    System.out.println(seq[j]);
                }

            }


        }
        return count;
    }

    public static void main(String[] args) {
        String[] seq = {"a","abc","bc","d"};
        String s = "abc";
        System.out.println(patterns(seq,s));
    }
}
