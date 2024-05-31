package Recursion;

public class TrianglePattern {
    public static void TP(int rows,int i){
        if(i>=rows){
            return ;

        }
        else {
            for (int j = 0; j <= i; j++) {

                System.out.print("*" + " ");

            }
            System.out.println("");

             TP(rows, i+1);


        }





    }

    public static void main(String[] args) {
        int rows =5;
        TP(rows,0);
    }

}
