package Array;

public class NumberOfGoodPairs {
    static int Pairs(int[] a){
        //String ans ;
        int count = 0;

        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j < a.length; j++) {


                if(a[i] == a[j] && i<j){
                    //ans = (i+","+j);
                    //System.out.println(ans);
                    count++;
                }


            }

        }
        return count;

    }

    public static void main(String[] args) {
        int[] nums = {1,2,3};
        System.out.println(Pairs(nums));
    }

}
