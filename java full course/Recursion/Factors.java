package Recursion;

/* input : 16
output : 1 2 4 8 16
 */
public class Factors {

    static void factors(int n, int i)
    {

        // Checking if the number is less than N
        if (i <= n) {
            if (n % i == 0) {
                System.out.print(i + " ");
            }

            // Calling the function recursively
            // for the next number
            factors(n, i + 1);
        }
    }
    // Driver code
    public static void main(String args[])
    {
        int N = 16;
        factors(N, 1);
    }

}
