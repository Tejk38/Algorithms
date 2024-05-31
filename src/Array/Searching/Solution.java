package Array.Searching;

import java.util.HashMap;
import java.util.Map;

class Solution
{
    static int majorityElement(int a[], int size)
    {
        // your code here
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int i=0; i < size; i++){
            int key = a[i];

            if(mp.containsKey(key)){

                int freq = mp.get(key);
                freq++;
                mp.put(key,freq);


            }
            else{
                mp.put(key,1);
            }



        }
        int res =-1, max = size/2;

        for(Map.Entry<Integer,Integer> i: mp.entrySet()){

            if(i.getValue()>max){
                res = i.getKey();
                return res;
            }

        }

        int min = Integer.MIN_VALUE;
        return -1;
    }

    public static void main(String[] args) {
        int[] ar = {15};

        int size = ar.length;

        System.out.println(majorityElement(ar,size));


    }
}
