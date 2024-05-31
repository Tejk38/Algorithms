package Recursion;

public class ProductOfDigits {
    static int POD(int n){
        if(n%10 == n){
            return n;
        }
        return (n%10) * POD(n/10);
    }

    public static void main(String[] args) {
        int ans = POD(1342);
        System.out.println(ans);
    }
}
