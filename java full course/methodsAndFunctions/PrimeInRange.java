package methodsAndFunctions;


public class PrimeInRange {
    static boolean  isPrime(int start, int end) {
        int element = 0;
        for (int i = start; i < end; i++) {

            if (i < 1) {
                return false;
            }
            int c = 2;
            while (c * c <= i) {
                if (i % c == 0) {
                    return false;
                }

                c++;

            }





        }
        return true;
    }

//    public static void main(String[] args) {
//        int start = 1;
//        int end = 10;
//        for(int i = start; i<end; i++) {
//            if (isPrime(i)) {
//                System.out.println(i+" ");
//            }
//        }
//        //System.out.println(isPrime(start,end));
//        //isPrime(start,end);
//    }
}
