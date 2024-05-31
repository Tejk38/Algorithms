package Recursion;

//public class MaxNdMinVal {
//    static int[] ar = {1,4,3,-5,-4,8,6};
//    static int temp = 0;
//    public static void val(int min, int max, int index){
//        if(index > ar.length -1 ){
//            System.out.println(min+" "+ max);;
//        }
//        if (index < ar.length ) {
//            if (ar[index] > max && index < ar.length) {
//                temp = ar[index];
//                ar[index] = max;
//                max = temp;
//            }
//            if (ar[index] < min && index < ar.length) {
//                temp = ar[index];
//                ar[index] = min;
//                min = temp;
//            }
//            val(min, max, index + 1);
//        }
//    }
//    public static void main(String[] args) {
//            int index = 0;
//    int min = ar[0];
//    int max = ar[1];
//        val(min,max,index);
//
//    }
//
//}
public class MaxNdMinVal {
    public static void values(int min, int max,int[] ar, int index){

        if(index == ar.length){
            System.out.println("min:"+min+" "+"max:"+max);
            ;
        }
        else {
            if (ar[index] > max){
                values(min,ar[index],ar,index+1);
            } else if
            (ar[index] < min){
                values(ar[index],max,ar,index+1);
            }
            else {
                values(min,max,ar,index+1);
            }
        }
    }
    public static void main(String[] args) {
        int[] ar = {1, 4, 3, -5, -4, 8, 6};
        values(0,0,ar,0);
    }


}






















