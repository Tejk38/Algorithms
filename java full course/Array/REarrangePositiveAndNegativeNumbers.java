package Array;

public class REarrangePositiveAndNegativeNumbers {
    static void outar(int[] ar, int n){
        int j = -1, temp = 0;

        for (int i = 0; i < n; i++) {

            if(ar[i]<0){
                j++;
                temp = ar[i];
                ar[i] = ar[j];
                ar[j] = temp;

            }


        }

        int pos = j + 1, neg = 0;

        while(pos<n && neg<pos && ar[neg]<0){
            temp = ar[neg];
            ar[neg] = ar[pos];
            ar[pos] = temp;

            pos++;
            neg+=2;

        }

    }
    static void printArray(int[] ar, int n){
        for (int i = 0; i < n; i++) {

            System.out.print(ar[i]+" ");

        }
    }

    public static void main(String[] args) {
        int[] ar = {-1, 2, -3, 4, 5, 6, -7, 8, 9};
        int n = ar.length;
        outar(ar,n);
        System.out.println();
        printArray(ar,n);
    }
}
