package BinarySearch;

public class mountainArray {

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

    public static void main(String[] args) {
        int[] arr = {0,1,0};

        System.out.println(peakIndexInMountainArray(arr));


    }
}
