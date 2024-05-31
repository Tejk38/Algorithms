package Array.Subset;


// find all subsets of a given array
public class FindAll {

    static void subs(int[] ar,int s, int e){

        if (e == ar.length){
            return;
        }
        else if (s>e) {
            subs(ar,0,e+1);
        }
        else {
            System.out.print("[");
            for (int i = s; i < e; i++) {
                System.out.print(ar[i]+",");

            }
            System.out.print(ar[e]);
            System.out.print("]");
            subs(ar,s+1,e);
        }


    }

    public static void main(String[] args) {
        int[] ar = {1,2,3,4};
        subs(ar,0,0);
    }

}
