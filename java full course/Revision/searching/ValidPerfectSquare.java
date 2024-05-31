package Revision.searching;

public class ValidPerfectSquare {
    public static boolean validsquare(int num){
//        int[] ar= new int[num];
        for (int i = 1; i < num; i++) {

            if(num ==i*i){
                return true;
            }

        }
        return false;

    }

    public static void main(String[] args) {
        System.out.println(validsquare(26));
    }

}
