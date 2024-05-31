package Array.Searching;
//Return element which is repeated the most

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map.Entry;

public class RepeatedNum {

    //basic bruteforce method
    static int findnum(int[] arr, int n){
        int maxcount = 0, element_having_max_freq =arr[0];
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }

            if (count > maxcount) {
                maxcount = count;
                element_having_max_freq = arr[i];
            }
        }

        return element_having_max_freq;

    }


    //Using a sorted array
    static int findnumsort(int[] ar, int n){
        Arrays.sort(ar);

        int countf = 1, count = 1, el = ar[0];

        for (int i = 1; i < n ; i++) {

            if (ar[i]==ar[i-1]){
                countf++;

            }
            else{
                countf=1;
            }

            if(countf>count){
                count = countf;
                el = ar[i-1];
            }

        }
        return el;
    }


    //Using hashmaps [ O(n) both t&s complexity]
    static int findnumshash(int[]ar, int n){
        //int freq=1;
        HashMap<Integer,Integer> a= new HashMap<>();
        for (int i = 0; i < n; i++) {

            int key= ar[i];
            if(a.containsKey(key)){

                //a.get(key) retrieves the value of the key or the frequency of the key
                int freq = a.get(key);
                freq++;
                a.put(key,freq);

            }

            else{
                a.put(key,1);

            }
        }
        int max = 1, res=-1;
        //find max frequency
        for (Entry<Integer,Integer> r : a.entrySet()) {


            if (r.getValue()>max){
                res= r.getKey();
                max = r.getValue();

            }


        }
        return res;
        
    }

    public static void main(String[] args) {
        int  arr[] = {10, 20, 10, 20, 30, 20, 20};
        int n = arr.length;
        System.out.println(findnumshash(arr,n));
    }

}
