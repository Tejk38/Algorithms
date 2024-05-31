package LeetCodeeQue.Easy;

import java.util.ArrayList;
import java.util.Arrays;

/*n=5
   [1]
  [1,1]
  [1,2,1]
  [1,3,3,1]
  [1,4,6,4,1]


 */
public class PascalTriangle {

    static ArrayList<ArrayList<Integer>> tri(int n){
        ArrayList<ArrayList<Integer>> triangle = new ArrayList<>();

        if(n==0)return triangle;

        ArrayList<Integer> row = new ArrayList<>();

        row.add(1);
        triangle.add(row);

        for (int i = 1; i < n ; i++) {

            ArrayList<Integer> prev_row = triangle.get(i-1);

            row = new ArrayList<>();

            row.add(1);

            for (int j = 1; j < i ; j++) {
                row.add(prev_row.get(j-1)+prev_row.get(j));

            }
            row.add(1);

            triangle.add(row);




        }
        return triangle;



    }

    public static void main(String[] args) {
        int n = 15;
        ArrayList<ArrayList<Integer>>t = tri(n);
        for (ArrayList<Integer> a:
             t) {
            System.out.println(a);

        }
    }
}
