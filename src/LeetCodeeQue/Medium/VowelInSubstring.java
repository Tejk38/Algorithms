package LeetCodeeQue.Medium;

// Count the number of vowels in a substring of size k
// Return the max number of vowels in a substring
public class VowelInSubstring {

    static int vowel(String s, int k) {
        int i = 0, count = 0, maxcount = 0;

        while (i < s.length()) {
            char ch = s.charAt(i);

            switch (ch) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    count++;
                    break;
                default:
                    count = 0;
            }

            if (i >= k - 1) {
                maxcount = Math.max(maxcount, count);
            }

            i++;
        }

        return maxcount;
    }

    public static void main(String[] args) {
        String s = "leetcode";
        int k = 3;
        System.out.println(vowel(s, k)); // Output: 2
    }
}
