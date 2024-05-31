public class main {
    static int maxprof(int[] arr, int len){
        int sum = 0;
        int max = 0;
        int sumf= 0;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length && (arr[j] > arr[i]) ; j++) {
                    max  = arr[j] - arr[i];
                    if(max>sum){
                        sum = max;
                    }
            }
            if(sum>sumf){
                sumf += sum;
            }
            sum = 0;
        }
        return sumf;
    }
    static int platform(int[] arr, int[] dep, int l){
        int count = 1;
        for (int i = 1; i < l-1; i++) {
            for (int j = 0; j < l; j++) {
                if(dep[i]>arr[j]){
                    count++;
                    break;

                }

            }

        }
        return count;
    }




    public static void main(String[] args) {
        int[] ar = {900,1100,1200};
        int[] dep = {1000,1150,1250};
        int l = ar.length;
        //System.out.println(maxprof(ar,l));
        System.out.println(platform(ar,dep,l));

    }
}
