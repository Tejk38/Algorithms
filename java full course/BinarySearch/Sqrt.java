package BinarySearch;

public class Sqrt {
    static int solution(int x){
        int start = 0;
        int end = x;

//        int mid = start + (end - start)/2;


        while(end>=start){
            int mid = start + (end - start)/2;

            if(mid>x/mid){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return end;
    }

    public static void main(String[] args) {
        int x = 26;
        System.out.println(solution(x));
    }
}
