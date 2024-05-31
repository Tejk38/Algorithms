package Array;

import java.util.ArrayList;

public class Arraylist {
    public static void main(String[] args) {
        //syntax
        ArrayList<Integer> list = new ArrayList<Integer>(10);

        list.add(89);
        list.add(76);
        list.set(0,99);
        list.remove(0);

        for(int i = 0; i<1; i++){
            System.out.println(list.get(i));
        }
        System.out.println(list);
    }
}
