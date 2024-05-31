package Array.Searching;

import java.util.HashMap;
import java.util.Map;

//find the element that appears only once while others appear twice
public class LeastOccurrence {

    // using XOR method
    static int occurrencexor(int[] ar, int n){

        int res = ar[0];
        for (int i = 1; i < n; i++) {

            res = res^ar[i];


        }
        return res;
    }







    //using hashmap method
    static int occurrence(int[] ar, int n){
    HashMap<Integer,Integer> hp = new HashMap<>();
        for (int i = 0; i < n; i++) {


            int key =ar[i];
            if (hp.containsKey(key)) {
                int freq = hp.get(key);
                freq++;
                hp.put(key, freq);
            } else {
                hp.put(key, 1);
            }
            for (Map.Entry<Integer,Integer> el: hp.entrySet()) {

                int rel = -1;
                if(el.getValue()==1){
                    int num = el.getKey();
                    int val = el.getValue();
                    if(val==1){
                        return num;

                    }
                }


            }
        }
    // finding element with only one occurrence






    return -1;
    }


    public static void main(String[] args) {
        int[] ar= {2,3,5,4,5,3,4};
        int n = ar.length;
        System.out.println(occurrencexor(ar,n));
    }

}
