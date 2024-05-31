package Array;

import java.util.Scanner;

public class FindtheMissingNum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the n value:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the numbers:");

        for(int i =0; i<n; i++){

            arr[i] = sc.nextInt();

        }

        int sum = (n+1)*(n+2)/2;
        for(int i =0; i<n; i++){

            sum = sum - arr[i];
        }

        System.out.println(sum);
    }
}
