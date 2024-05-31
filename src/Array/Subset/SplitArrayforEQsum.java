package Array.Subset;

//split array such that there exists two arrays which have the same sum
public class SplitArrayforEQsum {

    static int aryssum(int[] ar, int n){

        int leftsum=0;
        for (int i = 0; i < n; i++) {
            leftsum += ar[i];

        }
        int rightsum = 0;
        for (int i = n-1; i >=0; i--) {
            rightsum += ar[i];

            leftsum -= ar[i];


            if(rightsum == leftsum){
                return i;
            }

        }
        return -1;

    }

    static void printTwoArray(int[] ar, int n){

        int splitpoint = aryssum(ar,n);

        if(splitpoint == -1||splitpoint==n){
            System.out.println("no possible solution");
        }
        else {
            for (int i = 0; i < n; i++) {

                if (splitpoint == i) {
                    System.out.println();
                }
                System.out.print(ar[i] + " ");
            }
        }


    }

    public static void main(String[] args) {
        int[] ar= {1,2,3,4,5,5};
        int n = ar.length;
        printTwoArray(ar,n);
    }


}
