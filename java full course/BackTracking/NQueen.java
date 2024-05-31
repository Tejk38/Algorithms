package BackTracking;

public class NQueen {
    public static void main(String[] args) {
        int n = 4;
        boolean[][] board = new boolean[n][n];
        System.out.println(nQueen(board, 0));
    }
    static int nQueen(boolean[][] board, int r){
        if (r==board.length){
            display(board);
            System.out.println();
            return 1;
        }
        int count = 0;
         for (int c = 0; c < board.length; c++) {
             // placing the queen

             if (isSafe(board, r, c)) {
                board[r][c] = true;
                count += nQueen(board, r + 1);
                board[r][c] = false;
            }
        }
        return count;
    }
    static boolean isSafe(boolean[][] board,int r, int c){
        for (int i = 0; i < r; i++) {
            if (board[i][c]) {
                return false;
            }
        }
        int maxleft = Math.min(r,c);
        for (int i = 0; i <= maxleft ; i++) {
            if (board[r-i][c-i]){
                return false;
            }
        }
        int maxright = Math.min(r, board.length-c-1);
        for (int i = 0; i <= maxright  ; i++) {
            if (board[r-i][c+i]){
                return false;
            }
        }
        return true;
    }
    private static void display(boolean[][] board) {
        for (boolean[] ar: board){
            for (boolean element : ar){
                if(element){
                    System.out.print("q");
                }
                else {
                    System.out.print("x");
                }
            }
            System.out.println();
        }
    }
}
