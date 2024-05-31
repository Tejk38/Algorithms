package Linear_Search;

public class CountNegativeNos {
//    static int count(int[][] ar){
//        int count = 0;
//        int s = 0;
//        int e = ar.length-1;
//        for (int i = 0; i < ar.length ; i++) {
//            for (int j = 0; j < ar[i].length ; j++) {
//
//                if(ar[i][j]<0){
//                    count ++;
//                }
//            }
//        }
//        return count;
//    }
    static int count(int[][] grid){
        int sum = 0;
        for(int[] ar: grid){
            int count = Bs(ar);
            sum += count;
        }
        return sum;
    }

    static int Bs(int[] ar){
        int start = 0;
        int end = ar.length-1;
        int count  = 0;
        while(end>=start){
            int mid = start+ (end -start)/2;
            if(ar[mid]>=0){
                start = mid+1;
            }
            else{
                count=ar.length-mid;
                end = mid-1;

            }

        }
        return count;
    }

    public static void main(String[] args) {
        int[][] ar = {{4,3,2,-1},
                {3,2,1,-1},{1,1,-1,-2},
                {-1,-1,-2,-3}};
//        int[][] ar = {{3,2},{1,0}};
        System.out.println(count(ar));
    }
}
