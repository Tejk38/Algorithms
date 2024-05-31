package Practice.Array;

import java.util.*;

public class groupanagram {
        public static List<List<String>> groupAnagrams(String[] strs) {
            Map<String, List<String>> map = new HashMap<>();

            for (String word : strs) {
                char[] chars = word.toCharArray();
                Arrays.sort(chars);
                String sortedWord = new String(chars);

                if (!map.containsKey(sortedWord)) {
                    map.put(sortedWord, new ArrayList<>());
                }

                map.get(sortedWord).add(word);
            }

            return new ArrayList<>(map.values());
        }

    public static void main(String[] args) {

       groupanagram solution = new groupanagram();

        String[] ar = {"eat","tea","tan","ate","nat","bat"};

        List<List<String>> result = solution.groupAnagrams(ar);

        // Printing the result
        for (List<String> group : result) {
            System.out.print(group);
        }

    }


}
