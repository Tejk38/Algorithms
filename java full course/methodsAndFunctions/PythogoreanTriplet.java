package methodsAndFunctions;

public class PythogoreanTriplet {

    static boolean isTriplet(int[] a, int n){
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n ; j++) {
                for (int k = j+1; k < n; k++) {

                    int x = a[i]*a[i], y = a[j]*a[j], z = a[k]*a[k];

                    if(x==y+z||z==x+y||y==z+x){
                        return true;
                    }

                }

            }

        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {3,1,4,6,5};
        int n = arr.length;
        System.out.println(isTriplet(arr,n));
    }
}
