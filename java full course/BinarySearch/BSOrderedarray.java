package BinarySearch;

public class BSOrderedarray {
    public static void main(String[] args) {
        int[] arr = {-5,-1,2,3,4,16,18,22,28,45};
        int target = 22;
        int ans = bs(arr,target);
        System.out.println(ans);

    }
    //return the index
    // return -1 if it does not exist
    static int bs(int[] arr, int target){

        int start = 0;

        int end = (arr.length)-1;

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
}
