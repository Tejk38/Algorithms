package Recursion;

public class REVNUm {
    static void RN(int n){
        if(n==0){
            return;
        }
        System.out.print(n%10);
        RN(n/10);


    }

    public static void main(String[] args) {
        RN(1824);
    }
}
