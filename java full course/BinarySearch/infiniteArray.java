package BinarySearch;

public class infiniteArray {

    static int binarySearch(int[] arr, int target, int start, int end){


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

    static int ans(int[] arr, int target){
        int start = 0;
        int end = 1;

        //condition for target to be in the range
        while(arr[end]<target){

            int temp = end + 1;
            //double the box value
            // end = prev end + sizeofbox*2;
            end = end + (end-start + 1)*2;

            start = temp;



        }
        return binarySearch(arr, target, start, end);
    }

    public static void main(String[] args) {
        int[] arr = {3,5,7,9,10,90,100,130,140,160,170};
        int target = 10;

        System.out.println(ans(arr,target));
    }

}
