package Linear_Search;

public class PeakIndexInMountainArray {
    static int peakInd(int[] ar){
        int s = 0;
        int e = ar.length-1;
        while(e>s){
            int mid = s + (e-s)/2;

//            if (ar[mid] == target){
//
//                return mid;
//            }
            if(ar[mid]>ar[mid+1]){
                e = mid;
            }
            else{
                s = mid+1;
            }

        }
        return s;
    }

    public static void main(String[] args) {
        int[] ar = {24,69,100,99,79,78,67,36,26,19};
        System.out.println(peakInd(ar));
    }
}
