import java.util.Arrays;

public class FindDuplicateNum {
    //Time complexity: O(n)

    public static void main(String[] args) {
        int[] num = {1,2,2,4,5};
        System.out.println(findDuplicate(num));
    }
    static int findDuplicate(int[] num){
        int i = 0;
        while(i<num.length){
            if (num[i]!=i+1){
                int correct = num[i]-1;
                if (num[i]!=num[correct]){
                    swap(num,i,correct);
                }else {
                    return num[i];
                }

            }else {
                i++;
            }
        }
        return -1;
    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second]  = temp;
    }
}
