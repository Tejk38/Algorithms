package methodsAndFunctions;
import java.util.Scanner;

public class Factorial_function {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(fact(n));

    }
    static int fact(int n){
        int r = 1;
        for(int i = 0; i<n; i++){


            r = r*(n-i);
           // System.out.println(r);


        }
        return r;
    }
}
