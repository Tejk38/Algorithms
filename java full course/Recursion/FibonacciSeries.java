package Recursion;

import java.util.ArrayList;

public class FibonacciSeries {

    static int series(int n){
        int num = 0;
        if (n<2){
            return n;

        }
        num += (series(n-1)+series(n-2));
        return num;

    }


    public static void main(String[] args) {
        int ans = series(6);
        System.out.println(ans);
    }
}
