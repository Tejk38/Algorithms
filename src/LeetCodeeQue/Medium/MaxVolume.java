package LeetCodeeQue.Medium;
/*You are given an integer array height of length n.
There are n vertical lines drawn such that the two endpoints of the ith
line are (i, 0) and (i, height[i]).


Find two lines that together with the x-axis form a container,
such that the container contains the most water.

Return the maximum amount of water a container can store.

Notice that you may not slant the container.

Input: height = [1,8,6,2,5,4,8,3,7]
        Output: 49
        Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7].
        In this case, the max area of water (blue section) the container can contain is 49.

*/
public class MaxVolume {

    static int maxArea(int[] height){
        int first_ptr = 0;
        int last_ptr = height.length-1;

        int max = 0, prev_max = 0;

//        for (int i=0;i< height.length;i++) {
//            if (height[i]>height[last_ptr]){
//                last_ptr = i;
//
//            }
//            prev_max = (last_ptr-first_ptr)*Math.min(height[first_ptr],height[last_ptr]);
//            if(max<prev_max){
//                max = prev_max;
//
//            }
//            prev_max = 0;
//            first_ptr++;
//        }
        while(first_ptr<last_ptr){
            if(height[first_ptr]<height[last_ptr]){
                max = Math.max(max,height[first_ptr]*(last_ptr-first_ptr));
                first_ptr+=1;
            }
            else{
                max = Math.max(max,height[last_ptr]*(last_ptr-first_ptr));
                last_ptr-=1;
            }
        }
        return max;


    }

    public static void main(String[] args) {
        int[] ar = {2,3,4,5,18,17,6};
        System.out.println(maxArea(ar));
    }
}
