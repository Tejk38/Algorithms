package Array;
import java.util.ArrayList;
public class DuplicateNum {

    static int dupnum(int[] ar,int size){

        ArrayList<Integer> al = new ArrayList<>();

        for(int i : ar){
            if(al.contains(i)){
                return i;
            }
            al.add(i);
        }
        return -1;
    }

    public static void main(String[] args){

        int[] arr = {1,2,3,4,5,4,5,2};

//        for(int i = 0; i<arr.length;i++){
//            for(int j = i+1; j<arr.length; j++){
//                if(arr[i] == arr[j]){
//                    System.out.println(arr[i]+" "+j);
//                    //System.out.print(j);
//                }
//            }
//        }
        System.out.println(dupnum(arr,arr.length));
    }

}
