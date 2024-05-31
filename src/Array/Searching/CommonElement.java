package Array.Searching;

import java.util.ArrayList;

//element that is present in all the given sorted array
public class CommonElement {

    static int ele(int[]ar1,int[]ar2,int[]ar3){
        ArrayList<Integer> al= new ArrayList<>();
        for (int i = 0; i < ar1.length; i++) {
            for (int j = 0; j < ar2.length; j++) {

                if(ar1[i]==ar2[j]){
                    al.add(ar1[i]);
                }

            }

        }
        for (int i:ar3) {
            if(i==al.get(0)){
                return i;
            }

        }

    return -1;

    }

    static int sameel(int[]ar1,int[]ar2,int[]ar3){
//        for (int i = 0; i < ; i++) {
//        }
        int i =0, j= 0, k=0;
        while(i<ar1.length&&j<ar2.length&&k<ar3.length){

            if((ar1[i]==ar2[j]) && (ar2[j]==ar3[k])){

                return ar3[k];

            }
            else if(ar1[i]<ar2[j]&&ar1[j]<ar3[k]){
                i++;

            }
            else if(ar2[j]<ar1[i]&&ar2[j]<ar3[k]){
                j++;

            }
            else {

                k++;
            }



        }

        return -1;

    }

    public static void main(String[] args) {
        int ar1[] = {1, 5, 10, 30, 40, 80};
        int ar2[] = {6, 7, 20, 80, 100};
        int ar3[] = {3, 4, 15, 20, 30, 70, 80, 120};

        System.out.println(sameel(ar1,ar2,ar3));
    }

}
