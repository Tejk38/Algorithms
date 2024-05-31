package LeetCodeeQue.Easy;

public class MaxAverage {
    static double avg(int[] ar, int k){
        int i = 0, sum = 0;
        double maxSum = Integer.MIN_VALUE;

        while (i < ar.length) {
            sum += ar[i];

            if (i >= k - 1) {
                maxSum = Math.max(maxSum, (double) sum / k);
                System.out.println(maxSum);
                sum -= ar[i - k + 1];
            }



            i++;
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] ar = {1, 12, -5, -6, 50, 3};
        System.out.println(avg(ar, 4));
    }
}
