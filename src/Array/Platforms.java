package Array;

// Find number of platforms reqd
public class Platforms {

    static int platform(int[] arr, int[] dep, int n){
        int i = 1;
        int j = 0;
        int plt = 1;
        while(i<n){

            if(arr[i]>dep[j]){
                if(plt>1){
                    plt-=1;
                }

               j++;
            }
            else {
                plt+=1;
                i++;

            }

        }
        return plt;
    }

    public static void main(String[] args) {
       int[] arr = {900, 1100, 1235};
        int[] dep = {1000, 1200, 1240};
        int n = 3;
        int a = platform(arr,dep,n);
        System.out.println(a);
    }
}
