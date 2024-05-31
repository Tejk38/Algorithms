package Array;

public class SpiralmatrixIII {
    public static int[][] spiralmatrixIII(int rows, int cols, int rstart, int cstart){
        if (rows<0|| cols<0|| rstart<0|| cstart<0||rstart>=rows||cstart>=cols ){
            throw new IllegalArgumentException("input invalid");

        }
        int total = rows*cols;
        int[][] result = new int[total][2];
        result[0] = new int[]{rstart,cstart};
        if (total==1){
            return result;
        }
        int dist = 0;
        int row = rstart;
        int col = cstart;
        int[][] dirs = {{0,1},{1,0},{0,-1},{-1,0}};
        int diridx = 0;
        int count = 1;

        while(count<total){
            if (diridx == 0|| diridx == 2){
                dist++;
            }
            for (int i = 1; i <= dist ; i++) {
                row += dirs[diridx][0];
                col += dirs[diridx][1];
                if(row>=0 && row<rows && col>=0&& col < cols){
                    result[count++] = new int[]{row,col};
                    if (count==total){
                        return result;
                    }
                }


            }
            diridx = (diridx + 1)%4;


        }
        return result;
    }

    public static void main(String[] args) {
        int rows = 4;
        int cols = 5;
        int rStart = 3;
        int cStart = 4;

        int[][] positions = spiralmatrixIII(rows, cols, rStart, cStart);

        for (int[] position : positions) {
            System.out.println("(" + position[0] + ", " + position[1] + ")");
        }
    }
}
