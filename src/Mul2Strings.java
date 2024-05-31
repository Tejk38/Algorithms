public class Mul2Strings {

    static String multiplyStrings(String s1,String s2)
    {
        int sum1 = 0;
        int sum2 = 0;

        int i = 0;
        while(i<s1.length()){


            sum1 = (sum1 * 10) + (s1.charAt(i) - '0');


            i++;
        }
        System.out.println(sum1);
        i=0;
        while (i<s2.length()){

            sum2 = (sum2 * 10) + (s2.charAt(i) - '0');
            System.out.println(s2.charAt(i) - '0');


            i++;

        }

        sum1 = sum1*sum2;


        return String.valueOf(sum1);

    }

    public static void main(String[] args) {
        String s1 = "0033";

        String s2 = "-2";

        multiplyStrings(s1,s2);
    }

}
