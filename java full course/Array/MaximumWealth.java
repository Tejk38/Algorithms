package Array;

public class MaximumWealth {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},
                {9,1,6},
                {3,3,7}
        };
        System.out.println(maximumWealth(arr));

    }
    static int maximumWealth(int[][] accounts){
        int ans = Integer.MIN_VALUE;
        for (int[] ints : accounts) {
            int sum = 0;
            for (int anInt : ints) {


                sum += anInt;

                if (sum > ans) {
                    ans = sum;
                }


            }

        }
        return ans;
    }
}
