package String;

public class PalindromeCheck {
    public static void main(String[] args) {
        String a = "eye";

        for (int i = 0; i < a.length() ; i++) {
            int j = a.length()-1;

            if(a.charAt(i) == a.charAt(j)){
                System.out.println("its a palindrome");
            }
            j--;

        }
    }
}
