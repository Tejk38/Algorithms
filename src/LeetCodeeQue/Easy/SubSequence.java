package LeetCodeeQue.Easy;

// check if the first given string is subset of the other string
public class SubSequence {
    static boolean sub(String s1, String s2){
        int p1=0,p2=0;
        while(p1<s1.length()&&p2<s2.length()) {
            if (s1.charAt(p1) == s2.charAt(p2)) {
                p1++;
            }
            p2++;

        }
        return p1==s1.length();
    }

    public static void main(String[] args) {
        String s1 = "abc", s2 = "ab";
        System.out.println(sub(s1,s2));
    }
}
