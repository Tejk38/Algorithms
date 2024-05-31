package Array.Searching;

// Search algo to find an index where the element is same as it.
// arr[i]==i
public class FixedPoint {
    static int pointBinary(int[] ar, int n){
        int s = 0;
        int e = n-1;
        while (e>=s){
            int  mid= s+(e-s)/2;

            if(ar[mid]==mid){
                return mid;
            }
            else if (ar[mid-1]<mid-1) {
                s = mid+1;

            }
            else {
                e = mid-1;
            }

        }
        return -1;


    }

    public static void main(String[] args) {
        int[] ar = {0, 2, 5, 8, 17};
        System.out.println(pointBinary(ar,ar.length));
    }
}
