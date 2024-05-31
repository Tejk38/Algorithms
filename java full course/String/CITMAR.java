package String;

import org.jetbrains.annotations.NotNull;

import java.util.*;

//https://leetcode.com/problems/count-items-matching-a-rule/
public class CITMAR {
    static int countmatch(List<List<String>> items, String rulekey, String ruleValue){
        int count = 0;
        for (int i = 0; i < items.size(); i++) {


            if (rulekey == "type") {
                if (items.get(i).get(0) == ruleValue)
                count++;

            }
            if (rulekey == "color") {
                if (items.get(i).get(1) == ruleValue) {
                    ;
                    count++;
                }

            }
            if (rulekey == "name") {
                if (items.get(i).get(2) == ruleValue)
                count++;

            }
        }
        return count;
    }

    public static void main(String[] args) {
        List<List<String>> items = new ArrayList<>();

        List<String> innerList1 = new ArrayList<>();
        innerList1.add("computer") ;
        innerList1.add("silver");
        innerList1.add("lenovo");

        items.add(innerList1);

        List<String> innerList2 = new ArrayList<>();
        innerList2.add( "phone");
        innerList2.add( "blue");
        innerList2.add( "pixel");
        items.add(innerList2);

        List<String> innerList3 = new ArrayList<>();
        innerList3.add("phone");
        innerList3.add("gold");
        innerList3.add("iphone");

        items.add(innerList3);

        System.out.println(countmatch(items,"color", "brown"));







    }
}
