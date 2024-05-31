package Array.Subset;

//given two array's find out whether array 2 is the subset of array 1 or not.
public class SubArrCheck {

    static boolean check(int[] ar, int[] ar1, int n, int n1){
        int i = 0;
        int j = 0;
        int idx = 0;
        while (j<n1&&i<n){
            if (ar[i]==ar1[j]){
                i++;
                j++;
            }
            else {
                i=i-j+1;
                j=0;

                   }
               }
        return j==n1;
    }
    public static void main(String[] args) {
        int[] ar = {2,3,0,5,1,1,2};
        int[] ar1 = {3,0,5,1};

        System.out.println(check(ar,ar1,ar.length,ar1.length));

    }


}
