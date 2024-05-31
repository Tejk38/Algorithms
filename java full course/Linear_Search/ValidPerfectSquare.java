package Linear_Search;

public class ValidPerfectSquare {
    static boolean isPerfectSquare(int num){

//        for (int i = 0; i <= num ; i++) {
//
//            if(num==i*i){
//
//                return true;
//
//            }
//
//        }
//        return false;
        int s = 1;
        int e = num;

        while(e>=s){
            int mid = s +(e-s)/2;
            if (mid*mid == num){
                return true;
            }
            if (mid*mid >= num){
                e = mid-1;
            }
            else{
                s = mid+1;
            }

        }
        return false;
    }

    public static void main(String[] args) {
        int num = 253;
        System.out.println(isPerfectSquare(num));
    }
}
