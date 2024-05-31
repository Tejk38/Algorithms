package methodsAndFunctions;

import java.util.Scanner;

public class basicMethod {
    public static void main(String[] args) {
        //int ans = sum2();
        //System.out.println(ans);
        System.out.println(sum3(10,15));
    }
    static int sum3(int a, int b){
        int sum = a+b;
        return sum;
    }
    //return value
    static int sum2(){
        Scanner in = new Scanner(System.in);
        System.out.println("enter number 1:");
        int num1 = in.nextInt();
        System.out.println("Enter number 2: ");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        return sum;

    }
    static void sum(){
        Scanner in = new Scanner(System.in);
        System.out.println("enter number 1:");
        int num1 = in.nextInt();
        System.out.println("Enter number 2: ");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        System.out.println("The sum = " + sum);



    }
}
