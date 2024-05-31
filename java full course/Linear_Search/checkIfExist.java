package Linear_Search;

public class checkIfExist {
    static boolean check(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(end>=start){
            int mid = start+(end-start)/2;
            if(arr[start]*2 == arr[mid] || arr[mid]*2 == arr[start]){
                end = mid;
                start = mid+1;
                return true;

            }
            else{
               mid++;
            }

        }
        return false;
    }

    public static void main(String[] args) {
        int[] ar = {10,2,5,3};
        System.out.println(check(ar));
    }
}
