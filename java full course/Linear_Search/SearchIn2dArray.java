package Linear_Search;

import java.util.Arrays;

public class SearchIn2dArray {
    public static void main(String[] args) {
        int[][] arr = {
                {23,4,1},
                {18,12,3,9},
                {78,99,34,56},
                {18,12},
        };
        int target = 56
                ;
        System.out.println(Arrays.toString(search(arr,target)));
        System.out.println(max(arr));

    }
    static int[] search(int[][] arr, int target){
        for (int row = 0; row < arr.length ; row++) {
            for(int col = 0; col<arr[row].length; col++){
                if (arr[row][col] == target){
                    return new int[]{row,col};
                }
            }

        }
        return new int[]{-1,-1};
    }

    static int max(int[][] arr){
        int max = arr[0][0];//int max = Integer.MIN_VALUE;
        for (int row = 0; row < arr.length ; row++) {//for(int[] ints:arr){
            for(int col = 0; col<arr[row].length; col++){//for(int element:ints){
                if (arr[row][col] > max){//if(element>max){
                   max = arr[row][col];//max = element;
                }
            }

        }
       return max;
    }

}
