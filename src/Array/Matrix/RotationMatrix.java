package Array.Matrix;

// rotate matrix in clock wise direction
//public class RotationMatrix {
//
//    static void rotate(int[][] matrix, int n){
//
//        int row = matrix.length;
//        int col = matrix[0].length;
//
//        for (int i = 0; i < row; i++) {
//            for (int j = i; j < col; j++) {
//                int temp = matrix[i][j];
//                matrix[i][j] = matrix[j][i];
//                matrix[j][i] = temp;
//            }
//        }
//        for (int i = 0; i < row; i++) {
//            int left = 0;
//            int right = n-1;
//
//            while (left<right){
//
//                int temp = matrix[i][left];
//                matrix[i][left]=matrix[i][right];
//                matrix[i][right] = temp;
//
//                left++;
//                right--;
//            }
//        }
//
//        for (int[] i:matrix
//             ) {
//            for (int j: i
//                 ) {
//
//                System.out.print(j+"");
//            }
//            System.out.println();
//        }
//
//
//
//    }
//
//    public static void main(String[] args) {
//        int[][] ar = {{1,2,3},{4,5,6},{7,8,9}};
//
//        rotate(ar, ar.length);
//    }
//
//
//}
public class RotationMatrix {

    static void rotate(int[][] matrix, int n) {
        // Step 1: Transpose the matrix
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // Step 2: Reverse each row to achieve clockwise rotation
        for (int i = 0; i < n; i++) {
            int left = 0;
            int right = n - 1;
            while (left < right) {
                int temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;
                left++;
                right--;
            }
        }

        // Print the rotated matrix
        for (int[] i : matrix) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] ar = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        rotate(ar, ar.length);

        System.out.println();

        int[][] ar2 = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
        rotate(ar2, ar2.length);
    }
}






