package Array;

public class FindNumbers {

    static int EN(int[] arr) {
        int c = 0;
        int count = 0;
        for (int in : arr) {

            while (in > 0) {

                in = in / 10;
                count++;
            }
            if (count % 2 == 0) {
                c++;
            }
            count = 0;


        }
        return c;
    }

    public static void main(String[] args) {
        int[] ar = {437,315,322,431,686,264,442};

        System.out.println(EN(ar));


    }
}
