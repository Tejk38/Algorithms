package Array;

public class CellswithOddValuesinaMatrix {

    static int oddCount(int[][] indices, int m, int n){
        int[][] a = new int[m][n];
        int count = 0;
        for (int i = 0; i < indices.length ; i++) {
            for (int j = 0; j < indices[0].length; j++) {
                a[indices[i][0]][j] = count++;
            }
           



        }
        for (int i = 0; i < a.length ; i++) {
            for (int j = 0; j < a[0].length ; j++) {
                System.out.print(a[i][j] + " ");

            }
            System.out.println();

        }
        count = 0;
        for (int i = 0; i < a.length ; i++) {
            for (int j = 0; j < a[0].length ; j++) {

                if(a[i][j] / 3 ==0){
                    count +=1;
                }
                else {
                    continue;
                }
            }

        }

    return count;
    }

    public static void main(String[] args) {
        int m = 2;
        int n = 3;
        int[][] indices = {{1,1}, {0,0}};

        System.out.println(oddCount(indices,m,n));


    }
}

