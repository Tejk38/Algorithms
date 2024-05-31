package Recursion;

public class BinarySearch {
    public static void main(String[] args) {
        int[] ar = {-1,0,3,5,9,12};
        int target = 9;
        ind(ar,target,0,ar.length-1);
        System.out.println();

    }
    static void  ind(int[] ar, int target, int start, int end){int mid = start+(end-start)/2;
        if(ar[mid]==target){
            System.out.println(mid);

       }
       while(end>=start){


           if (ar[mid]>target){
               ind(ar,target,start,mid-1);
           }
           else {
               ind(ar, target, mid + 1, end);
           }
           break;
       }

//       return -1;
    }
}
//public class BinarySearch{
//    static void target(int s, int e,  int target, int[] ar){
//        int mid = s+(e-s)/2;
//        if (s == e){
//            return ;
//        }
//
//        if (target>ar[mid]){
//            target(mid+1,e,target,ar);
//
//
//        } else if (target<ar[mid]) {
//            target(s,mid-1,target,ar);
//        }
//        else {
//            System.out.println(mid);
//        }
//
//    }
//
//    public static void main(String[] args) {
//        int[] ar= {1,2,3,4,5};
//        System.out.println();
//        target(0,ar.length-1,2,ar);
//    }
//}

















