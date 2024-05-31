package Array.Subset;

/*
Given an array of N integers and a number K, the task is to find the number of subarrays such that
 all elements
 are greater than K in it.

Examples:

Input: a[] = {3, 4, 5, 6, 7, 2, 10, 11}, K = 5
*/
public class NumOfSubArr {
    static int count = 0;
    static void subs(int[] ar, int k, int n, int s, int e){

        if(e== ar.length){
            System.out.println(count);
        }
        else if(s>e){

            subs(ar,k,n,0,e+1);
        }
        else {
//            System.out.print("[");
            for (int i = s; i <e ; i++) {
                if (ar[i]>k && ar[e]>k){
                    count+=1;
                }
            }
//            System.out.print("]");
            subs(ar,k,n,s+1,e);

        }



    }

    public static void main(String[] args) {
        int[] ar = {3, 4, 5, 6, 7, 2, 10, 11};
        int k= 3;
        subs(ar,k, ar.length, 0,0);
    }


}
