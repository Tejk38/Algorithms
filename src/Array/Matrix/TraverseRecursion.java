package Array.Matrix;


// Traverse matrix using recursion and print every element

public class TraverseRecursion {

    static void mat(int[][] ar, int r, int c){

        if(r== ar.length-1 && c == ar[ar.length-1].length){
            return;
        } else if (c<ar[r].length) {

            System.out.print(ar[r][c]+" ");
             mat(ar,r,c+1);

        }
        else {
            System.out.println();
            mat(ar,r+1,0);

        }


    }

    public static void main(String[] args) {
        int[][] ar =  {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};

        mat(ar,0,0);
    }

}
