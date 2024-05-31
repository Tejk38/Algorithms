package Array;

// Convert given roman number to normal number


public class RomanChar {

    public static int number(String roman){

        int ans = 0,number=0, prev = 0;
        for (int j = roman.length()-1; j>=0; j--){
            switch (roman.charAt(j)){
                case 'M' -> number = 1000;
                case 'D' -> number = 500;
                case 'C' -> number = 100;
                case 'L' -> number = 50;
                case 'X' -> number = 10;
                case 'V' -> number = 5;
                case 'I' -> number = 1;

            }
            if (number<prev){
                ans -= number;
            }
            else {
                ans+=number;
            }
            prev = number;


        }
        return ans;





    }

    public static void main(String[] args) {
        System.out.print(number("MCM"));
    }

}
