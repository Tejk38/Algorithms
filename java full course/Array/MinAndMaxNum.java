package Array;
import java.util.Scanner;

public class MinAndMaxNum {
    public static void main(String[] args){

       Scanner sc = new Scanner(System.in);
        int[] arr = new int[5] ;
        int max = arr[0];
        int min = arr[0];
        for(int i = 0; i<arr.length;i++){

          arr[i] = sc.nextInt();

            for(int j = i; j<i+1; j++){

                if(max<arr[j]){

                    max = arr[j];
                }
                if(min>arr[j]){

                    min = arr[j];
                }

            }

        }
        System.out.println(max);
        System.out.println(min);


    }
}
