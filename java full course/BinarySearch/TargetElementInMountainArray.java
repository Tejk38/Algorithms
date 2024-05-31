package BinarySearch;

public class TargetElementInMountainArray {
    static int search(int[] arr,int target){

        int peak = peakIndexInMountainArray(arr);
        int firstTry = bs(arr, target, 0, peak);

        if (firstTry != -1){
            return firstTry;

        }
        //try searching in 2nd half
        return orderAgnosticBS(arr,target, peak+1, arr.length-1);

    }
    public static int peakIndexInMountainArray(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while(start<end){

            int mid = start+(end-start)/2;
            if(arr[mid]>arr[mid+1]){
                //you are in dec part of array
                // this may be the ans, but look at left
                // this is why end!= mid -1;
                end = mid ;

            }else{
                // we are in asc part of arr
                start = mid+1;
            }
        }
        //in the end, start == end and pointing to the largest number because of the 2 checks.
        //start and end are always trying to find max element int he above 2 checks
        // hence, when they are pointing to just one element, that is the max one because
        //more elaboration: at every point of time for start and end, they have the best possible answer till that time

        // and if we are saying that only one item is remaining, hence cuz of above line checks
        return start;//or return end as both are =
    }
    static int bs(int[] arr, int target, int start, int end){

//        int start = 0;
//
//        int end = (arr.length)-1;

        while(start<=end){

            //find middle element

            //  int mid = (start+end)/2; // might be possible that (start+end) exceeds the range of integers in java.
            int mid = start+(end-start)/2;
            if(target<arr[mid]){
                end = mid - 1;
            }
            else if(target>arr[mid]){
                start = mid + 1;
            }
            else{
                //ans found
                return mid;
            }

        }
        return -1;
    }
    static int orderAgnosticBS(int[] arr, int target, int start, int end) {
//        int start = 0;
//        int end = arr.length - 1;

        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {

            //find middle element

            //  int mid = (start+end)/2; // might be possible that (start+end) exceeds the range of integers in java.
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else if (target > arr[mid]) {
                    start = mid + 1;
                }
            }
            else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else if (target < arr[mid]) {
                    start = mid + 1;
                }
            }

        }



        return -1;

    }

    public static void main(String[] args) {
        int[] arr = {24,69,100,99,79,78,67,36,26,19};
        int target = 3;
        //System.out.println(search(arr, target));
        System.out.println(peakIndexInMountainArray(arr));
    }
}
