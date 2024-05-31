package methodsAndFunctions;
import java.util.Scanner;
public class VotingRight {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(check(n));


    }
    static String check(int a){
        if(a >= 18){
            return "eligible";
        }
        else{
            return "not eligible";
        }
    }
}
