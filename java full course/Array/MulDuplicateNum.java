package Array;


//import java.util.Scanner;
public class MulDuplicateNum {
    public static void main(String[] args){

        //Scanner sc = new Scanner(System.in);
        //System.out.println("enter the desired sum:");
        //int s = sc.nextInt();
        int[] arr = new int[]{1,2,5,2,1,1,3,2};

        for(int i =0; i<arr.length;i++){

            for(int j = i+1; j<arr.length;j++){

                if(arr[i]==arr[j] && i!=j){
                    System.out.println(arr[j]+" "+i);
                }
            }
        }



    }

}

