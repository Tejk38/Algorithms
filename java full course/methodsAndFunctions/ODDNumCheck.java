package methodsAndFunctions;

import java.util.Scanner;

public class ODDNumCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(check(n));

    }

    static String check(int a) {
        if (a <= 1) {
            return "odd";

        }
        if (a % 2 == 0) {
            return "even";

        }else{return "odd";}
    }
}

