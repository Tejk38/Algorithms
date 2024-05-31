package Array;

public class CountMatches {
    static int Matches(String[][] items, String ruleKey, String ruleValue){

        int count = 0;
//        items = items.toCharArray();
        for (int i = 0; i < items.length ; i++) {


                if (ruleKey == "type"){

                    if(items[i][0] == ruleValue){
                        count++;

                    }

                }
            if (ruleKey == "color"){

                if(items[i][1] == ruleValue){
                    count++;

                }

            }
            if (ruleKey == "name"){

                if(items[i][2] == ruleValue){
                    count++;

                }

            }



        }
        return count;

    }

    public static void main(String[] args) {
        String[][] arr = {{"phone","blue","pixel"},
                {"computer","silver","lenovo"},
                {"phone","gold","iphone"}
        };
        String ruleKey = "color";
        String ruleValue = "silver";

        System.out.println(Matches(arr,ruleKey,ruleValue));
    }
}
