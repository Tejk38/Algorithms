package Question;

//Find three maximum elements in the array
public class FindMaxElements {

    static void maxEle(int[] ar, int size){

        int max1 = ar[0],max2=ar[0],max3=ar[0];

        for (int i = 1; i < size ; i++) {

            if(ar[i]>max1){
                int temp = max2;
                max2 = max1;
                max1 = ar[i];
                max3 = temp;
            }
            else if(ar[i]>max2 && ar[i]<max1){

                int temp = max2;
                max2 = ar[i];
                max3 = temp;
            }
            else{
                max3 = ar[i];
            }

        }
        System.out.println(max1+" "+max2+" "+ max3);
    }

    public static void main(String[] args) {
        int[] ar = {10,4,3,50,23,95};
        int size = ar.length;
        maxEle(ar,size);
    }
}
