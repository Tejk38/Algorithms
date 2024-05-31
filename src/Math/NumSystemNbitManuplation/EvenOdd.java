package Math.NumSystemNbitManuplation;

public class EvenOdd {


    // the idea is that in if we write any number in binary format, the number is odd only when the last digit to
    // the right is '1'. Because, all the other digits are multiples of 2 but only the digit to the extreme right is just 1(2^0);
    // 1100&0001 = 0001 -> 1 is odd.
    static boolean numcheck(int num){
        return ((num&1)==1);
    }

    public static void main(String[] args) {
        int n = 68;
        System.out.println(numcheck(n));
    }
}
