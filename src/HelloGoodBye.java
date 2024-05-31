import java.util.*;
//                                2 5 65 55 50 70 90
//                                        Output: 2 5 50 55 65 70 90
public class HelloGoodBye {

    static int[] sortedar(int[] ar, int n){
        int begin = 0;
        for (int i = 1; i < n; i++) {

            if (ar[i]<ar[i-1]){
                begin = i-1;
                System.out.println(begin);
                break;
            }

        }

        int end = 0;
        for (int i = n-2; i >0 ; i--) {

            if (ar[i]<ar[i+1]){
                 end = i-1;
                System.out.println(end);
                break;
            }

        }

        int temp = ar[end];
        ar[end] = ar[begin];
        ar[begin] = temp;




        return ar;
    }






        public static void main(String[] args) {
//            Scanner scanner = new Scanner(System.in);
//
//            System.out.println("Enter two strings separated by a space:");
//            String firstString = scanner.next();
//            String secondString = scanner.next();
//
//            System.out.println("hello"+" "+firstString);
//            System.out.println("goodbye"+" "+
//                    secondString);

            int[] ar = {1 ,7 ,6 ,5 ,4 ,3 ,2 ,8 };

            System.out.println(Arrays.toString(sortedar(ar,ar.length)));
        }
}





