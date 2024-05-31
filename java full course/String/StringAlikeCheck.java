package String;

public class StringAlikeCheck {
    static boolean halvesAreAlike(String s){
        StringBuilder str1 = new StringBuilder();
        StringBuilder str2 = new StringBuilder();
        StringBuilder str = new StringBuilder();
        char[] ch = {'a','e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
        int count1 = 0;
        int count2 = 0;

        int mid = s.length()/2;
        str.append(ch);
        str1.append(s,0,mid);
        str2.append(s,mid,s.length());

        for (int i = 0; i < str1.length(); i++) {
            for (int j = 0; j < s.length(); j++) {
                if (str1.charAt(i) == str.charAt(j)){
                    count1 = count1 +1;
                }

            }


        }
        for (int i = 0; i < str2.length(); i++) {
            for (int j = 0; j < s.length(); j++) {
                if (str2.charAt(i) == str.charAt(j)) {
                    count2 = count2 + 1;
                }

            }
        }
        if(count1 == count2){
            return true;
        }
        return false;





    }

    public static void main(String[] args) {
        String s = "tooth";
        System.out.println(halvesAreAlike(s));
    }
}
