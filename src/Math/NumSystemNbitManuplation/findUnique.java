package Math.NumSystemNbitManuplation;

// find the number that is not a duplicate
// 1^0 = 1; 1^1=0; "^" -> XOR 
public class findUnique {
    public static void main(String[] args) {
        int[] ar= {2,3,4,6,3,2,4};
        System.out.println(ans(ar));
    }

    private static int ans(int[] ar) {
        int unique= 0;
        for (int i:ar) {
            unique ^= i;
            System.out.println(unique);
        }
        return unique;
    }


}
