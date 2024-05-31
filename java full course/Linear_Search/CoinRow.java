package Linear_Search;

public class CoinRow {
    static int arrangeCoins(int coins){
        //int[] a = new int[];
        int row = 0;
        for (int i = 1; i <= coins ; i++) {
            for (int j = 1; j < i ; j++) {


                coins -= i;
                if (j > coins) {
                    row = i - 1;
                }
            }
            row ++;


        }

        return row;
    }

    public static void main(String[] args) {
        int num = 1;
        System.out.println(arrangeCoins(num));

    }
}
