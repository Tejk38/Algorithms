package Linear_Search;

public class SearchInsetPosition {
    static int pos(int[] ar, int target){
        int s = 0;
        int e = ar.length-1;
        while(e>=s){
            int mid = s + (e-s)/2;
            if(target<ar[0]){
                return 0;
            }
            if (ar[mid] == target){

                return mid;
            }
            if(ar[mid]>target){
                e = mid -1;
            }
            else{
                s = mid+1;
            }
            if (ar[e]!=target){
                if(ar[e]<target){
                    return e+1;
                }
//                if(ar[e]>target){
//                    return e;
//                }

            }
        }
        return e;
    }

    public static void main(String[] args) {
        int[] ar = {2,5};
        int target = 1;
        System.out.println(pos(ar,target));
    }

}
