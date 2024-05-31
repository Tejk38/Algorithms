import java.util.Arrays;

import static java.lang.Math.round;

public class rev {
    // finding a square root of a number using linear search(O(sqrt(n))
    static int sqrt(int num){
        if(num>0){
            for (int i = 1; i < num; i++) {
                float rt = num/i;
               // rt = round(rt);
                int a = (int) round(rt);
                if (rt == i){
                    return a;
                }
            }
        }
        return -1;
    }

    // finding first and last position of element
    // Array is sorted so binary search
    static int[] eleloc(int[] arr, int target){
        int s = 0;
        int e = arr.length-1;
        while(e>s){
            int mid = s+(e-s)/2;
            if (arr[mid] == target){
                if (arr[mid+1]>target&&arr[mid-1] == target){
                    return new int[]{mid-1, mid};
                }
                else if(arr[mid+1]==target) {
                    return new int[]{mid,mid+1};
                }
                else {
                    return new int[]{-1,-1};

                }
            }
            if (arr[mid]>target){
                e = mid-1;
            }
            if(arr[mid]<target){
                s = mid+1;
            }
        }
        return new int[]{-1,-1};
    }
    static int singleEle(int[] arr){
        int s = 0;
        int e = arr.length-1;
        if(arr.length<=1){
            return arr[s];
        }
        else {
            while (e >= s) {
                int mid = s + (e - s) / 2;


                if ((arr[mid] != arr[mid - 1] && arr[mid] != arr[mid + 1])) {
                    return arr[mid];
                }
//            if( arr[mid]!=arr[mid+1]&&arr[mid]==arr[mid-1]){
//                return arr[mid+1];
//            }
                if (arr[e - 1] == arr[e]) {
                    e = (e - 1) - 1;
                }
                if (arr[s + 1] == arr[s]) {
                    s = (s + 1) + 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
//        int n = 11;
        int[] ar = {1,1,2};
        //System.out.println(Arrays.toString(eleloc(ar,8)));
        System.out.println(singleEle(ar));
    }

}
