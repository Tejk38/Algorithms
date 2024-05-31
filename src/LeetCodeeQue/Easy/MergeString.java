package LeetCodeeQue.Easy;

// given two strings merge the string's such that the resultant has characters of
//alternative strings.
// s1 = "abc", s2="pqr", result = "apbqcr";

public class MergeString {

    static String merge(String s1,String s2){
        int l1 = s1.length()-1;
        int l2 = s2.length()-1;
        String merged = " ";

        int p1 =0, p2 = 0, i = 0;
        while (p1<=l1&&p2<=l2){
           merged+=s1.charAt(p1);
           p1++;
           merged+=s2.charAt(p2);
           p2++;
        }

        if(p1<=l1) {
            while (p1 <= l1) {
                merged += s1.charAt(p1);
                p1++;
            }
        }
        if (p2<=l2) {
            while (p2 <= l2) {
                merged += s2.charAt(p2);
                p2++;
            }
        }


        return merged;


    }

    public static void main(String[] args) {
        String s1 = "cf";
        String s2 = "eee";
        String ch = merge(s1,s2);
        System.out.println(ch);
    }
}
