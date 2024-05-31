package BinarySearch;

public class CeilOfAnArray {
    // ceil of an array is the closest number that is greater than the target element or the target number itself.
    public static void main(String[] args) {
        int[] arr = {-5,-1,2,3,4,16,18,23,28,45};
        int target = 22;
        int ans = ceil(arr,target);
        System.out.println(ans);

    }

    static int ceil(int[] arr, int target){

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
        return end; // for floor return start
    }
}

