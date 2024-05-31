package String;

public class Solution {

        static String defangIPaddr(String address) {
            StringBuilder str = new StringBuilder();

            for (int i = 0; i < address.length(); i++) {

                if (address.charAt(i) == '.'){
                    str.append("[.]");

                }
                else{
                    str.append(address.charAt(i));

                }


            }

            return str.toString();

        }

    public static void main(String[] args) {
            String a = "1.1.1.1";
        System.out.println(defangIPaddr(a));

    }









}
