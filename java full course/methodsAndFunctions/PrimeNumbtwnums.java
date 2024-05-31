package methodsAndFunctions;
import java.util.Scanner;

public class PrimeNumbtwnums {
    public static void main(String[] args) {
        //Scanner in = new Scanner(System.in);
        int n1 = 1 ;//in.nextInt();
        int n2 = 10;//in.nextInt();
        System.out.println(Nums(n1,n2));

    }
    static int Nums(int n1, int n2){
        while(n2>n1){
            n2--;
            if(n2<=1){
                return 0 ;
            }
            int c =2;
            while(c*c < n2){
                if(n2%c==0){
                    return 0;
                }
                c++;


            }//if()
        }
        return n1;
    }
}
