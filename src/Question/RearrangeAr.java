package Question;


//reposition array such that
//A[i] >= A[i-1], if i is even,  ∀ 1 <= i < n
//A[i] <= A[i-1], if i is odd ,  ∀ 1 <= i < n
public class RearrangeAr {

    static int[] rearrange(int[] ar, int n){

        for (int i = 1; i < n ; i++) {

            if(i%2==0){

                if(ar[i]>ar[i-1]){

                    swap(ar,i,i-1);
                }

            }
            else {

                if(ar[i]<ar[i-1]){

                    swap(ar,i,i-1);
                }

            }

        }
        return ar;
    }
    static int[] swap(int[] ar, int i, int j){

        int temp = ar[i];
        ar[i] = ar[j];
        ar[j] = temp;

        return ar;
    }

    public static void main(String[] args) {
        int[] ar = {1, 2, 2, 1};
        int size = ar.length;

        rearrange(ar,size);
        for (int i:
             ar) {
            System.out.print(i+" ");
        }
    }
}
