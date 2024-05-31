package Array;
import java.util.Scanner;
public class SumPairs {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the desired sum:");
        int s = sc.nextInt();
        int[] arr = new int[]{0,1,2,3,4,6};

        for(int i =0; i<arr.length;i++){

            for(int j = i; j<arr.length;j++){

                if(arr[i]+arr[j] == s && arr[i]!=arr[j]){
                    System.out.println(arr[i]+" "+arr[j]);
                }
            }
        }



    }

}
