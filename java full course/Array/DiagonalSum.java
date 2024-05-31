package Array;

public class DiagonalSum {

    static int DS(int[][] arr){
        int sum = 0;
        int n = arr.length;
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr[i].length ; j++) {

                if (i==j || (i+j==n-1)){
                    sum = sum + arr[i][j];
                }
            }

        }
        return sum;
    }

    public static void main(String[] args) {
//        int [][] arr = {{1,1,1,1},
//                {1,1,1,1},
//                {1,1,1,1},
//                {1,1,1,1}};
        int[][] arr = {{5}};

        System.out.println(DS(arr));


    }
}
