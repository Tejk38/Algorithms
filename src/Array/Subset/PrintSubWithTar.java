package Array.Subset;

// find if there is a sub array of given size which is equal to given target, if found return true else return false

public class PrintSubWithTar {

    static boolean sub(int[] ar, int n, int k, int tar){

        for (int i = 0; i < n-k+1 ; i++) {

            int currsum=0;

            for (int j = 0; j < k; j++) {

                currsum += ar[i+j];

            }
            if (currsum==tar){
                printsub(ar,n, i,k);
                return true;
            }

        }


        return false;
    }
    static void printsub(int[]ar, int n,int i,int k){
        for (int j=0;j<k;j++){
            System.out.print(ar[i+j]+" ");
        }
        System.out.println();

    }

    public static void main(String[] args) {
        int[] ar ={1, 4, 2, 10, 2, 3, 1, 0, 20};
        int target = 18;
        int k = 4;
        System.out.println(sub(ar,ar.length,k,target));

    }



}
