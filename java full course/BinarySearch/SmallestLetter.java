package BinarySearch;

public class SmallestLetter {


        // ceil of an array is the closest number that is greater than the target element or the target number itself.
     public static void main(String[] args) {

        char letters[] = {'c','e','f','j'};
        char target = 'j';
         System.out.println(nextGreatestLetter(letters,target));


        }
     static char nextGreatestLetter(char[] letters, char target){

            int start = 0;

            int end = (letters.length)-1;

            while(start<=end){

                //find middle element

                //  int mid = (start+end)/2; // might be possible that (start+end) exceeds the range of integers in java.
                int mid = start+(end-start)/2;

                if(target<letters[mid]){
                    end = mid - 1;
                }
                else{
                    start = mid + 1;
                }
//                else{
//                    //ans found
//                    return mid;
//                }

            }
            return letters[start % letters.length];
        }


}



