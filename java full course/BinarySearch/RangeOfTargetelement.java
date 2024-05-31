package BinarySearch;

import java.util.Arrays;

public class RangeOfTargetelement {
    public static void main(String[] args) {

        int[] ar = {5,7,7,8,8,10};
        int target = 8;

        System.out.println(Arrays.toString(search(ar,target)));

    }



    static int searchRange(int[] arr, int target, boolean findStartindex){

            int ans = -1;
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
                    ans = mid;
                    if(findStartindex){
                        end = mid -1;

                    }
                    else{
                        start = mid+1;
                    }

                }

            }
            return ans;
        }
    static int[] search(int[] arr, int target) {

        int[] ans = {-1,1};
        int start = searchRange(arr, target,true);
        int end = searchRange(arr, target, false);

        ans[0] = start;
        ans[1] = end;

        return ans;


    }
}

