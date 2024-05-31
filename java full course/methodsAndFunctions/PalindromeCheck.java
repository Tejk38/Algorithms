package methodsAndFunctions;

public class PalindromeCheck {
     static int  temp = 242;
    public static void main(String[] args) {
        System.out.println(check(242));

    }
    static int check(int n){
      int sum = 0;
      int r = 0;
      while(n>0){
          r = n%10;
          sum = (sum*10) + r;
          n = n/10;
      }
      return sum;
    }


}
