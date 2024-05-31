import com.sun.jdi.IntegerValue;

import java.util.*;

public class Revision {
    public static void main(String[] args) {
        int[] num = {1,2,3,4};
        int[][] nums = {{2,8,7},{7,1,3},{1,9,5}};
        //  int[][] nums = {{1,2,3},{3,2,1}};
//        System.out.println(Arrays.toString(getConcat(num)));
//        System.out.println(Arrays.toString(runningsum(num)));
//        System.out.println(richest(nums));

//        int[] nums1 = {1,2,3,4,5,6};
//        shufflearray(nums1,3);
        int[] kid = {4,2,1,1,2};
        //     System.out.println((mostcandies(kid,1)));

        int[] n = {1,2,3,1,1,3};
        // System.out.println(goodpair(n));

        int[] n1 = {8,1,2,2,3};
//        System.out.println(Arrays.toString(smallernum(n1)));

        String s = "leetcode";
        //System.out.println(pangram(s));

        int[][] arr = {{1,1,1,1},{1,1,1,1},{1,1,1,1},{1,1,1,1}};
        // System.out.println(diagonalSum(arr,0));

        int[][] transposear = {{1,2,3},{4,5,6},{7,8,9}};
        //  System.out.println(Arrays.deepToString(arTranspose(transposear)));

        //  permutation("","abc");

      //  int[] ar = {1,2,0,0};
        //System.out.println(addToArrayForm(ar,35));
        int[] numb = {2,7,11,15};
        System.out.println(Arrays.toString(targetNumindex(numb,9)));
        System.out.println();

    }

    public static int[] getConcat(int[] nums){
        int[] ans = new int[2*(nums.length)];
        for (int i = 0; i <= nums.length-1; i++) {

            ans[i] = nums[i];
            ans[(nums.length)+i] = nums[i];

        }
        return ans;
    }

    public static int[] runningsum(int[] nums){
        int[] ans = new int[nums.length];
        int count = 0;
        for (int i = 0; i < nums.length ; i++) {

            count = count+nums[i];
            ans[i] = count;

        }
        return ans;
    }
    public static int richest(int[][] num){
        int max = 0;
        int min=0;

        for (int i = 0; i < num.length-1; i++) {
            for (int j = 0; j < num[i].length; j++) {

                min += num[i][j];


            }
            if (min>max){
                max = min;
            }
            min = 0;


        }

        return max;


    }
    public static void shufflearray(int[] nums, int n){
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length/2 ; i++) {
            ans[i] = nums[i];
            ans[i+1] = nums[n+i];
        }
        System.out.println(Arrays.toString(ans));


    }
    static List<Boolean>  mostcandies(int[] arr, int n ) {
        // return an array with boolean value if the kid will have more number of candies .
        List<Boolean> ans = new ArrayList<>();
        int max = arr[0];
        for (int j = 1; j < arr.length ; j++) {
            if(arr[j] > max){
                max = arr[j];
            }
        }
        for (int num : arr
        ) {
            if (num + n >= max) {
                        ans.add( true);
                    } else {

                        ans.add(false);
            }
        }
        return ans;
    }

    static int goodpair(int[] num){ //no.of good pairs
        int count = 0;
        for (int j = 0; j<num.length; j++)
            for (int i = 0; i < num.length && i!=j ; i++) {
                if (num[j] == num[i]&&i<j){
                    count+=1;
                }
            }
        return count;
    }

    static int[] smallernum(int[] num) {
        int count = 0;
//        List<Integer> ans = new ArrayList<>();
        int[] ans = new int[num.length];
        for (int j = 0; j < num.length; j++) {
            count = 0;
            for (int i = 0; i < num.length ; i++) {
                if (num[j] > num[i] ) {

                    count+=1;


                }
            }
            ans[j] = count;

        }
        return ans;
    }

    static boolean pangram(String s){ // check if the given string has all the alphabets.
        for (int i = 0; i < 26 ; i++) {
            char curr = (char)('a' +i);

            if (s.indexOf(curr)==-1){
                return false;

            }


        }
        return true;

    }

    static void OddElement(int m, int n, int[][] indices){ // return number of elements in a matrix with odd values.

        int[][] ar = new int[m][n];
        int count = 0;

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < m; j++) {

//                ar[i] =

            }

        }


    }

    static int diagonalSum(int[][] arr, int sum){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {

                if (i==j || i+j==arr.length-1){
                    sum += arr[i][j];
                }

            }

        }
        return sum;
    }


    static int[][] arTranspose(int[][] matrix){
        int [][] ans = new int[matrix[0].length][matrix.length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                ans[j][i] = matrix[i][j];

            }
        }
        return ans;
    }

    static void permutation(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        for (int i = 0; i<=p.length(); i++) {
            String f = p.substring(0,i);
            String s = p.substring(i,p.length());
            permutation(f+ch+s, up.substring(1));

        }
//        char ch = up.charAt(0);
//        for (int i = 0; i <=p.length(); i++) {
//
//            String f = p.substring(0,i);
//            String s = p.substring(i,p.length());
//            permutation(f+ch+s, up.substring(1));
//
//        }




    }
    static List<Integer> addToArrayForm(int[] num, int k){
        List<Integer> list = new ArrayList<>();
        String n = "";
        for (int i = 0; i < num.length ; i++) {

            n += num[i];

        }
        int n1 = Integer.valueOf(n);

        n1 += k;
        while(n1>0){

            list.add(n1%10);
            n1/=10;


        }
        Collections.reverse(list);
        return  list;

    }

    static int[] targetNumindex(int[] numbers, int target){

        int[] ans = new int[2];
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {

                if (numbers[i]+numbers[j] == target && numbers[i]!=numbers[j]){
                    ans[0] = j+1;
                    ans[1] = i+1;
                }

            }

        }


        return ans;


    }







}

