package Array.Searching;
//Executing code to search for min and max num in different methods.


import static java.util.Arrays.sort;

//1) just brute force search
// runtime: O(nlogn), space: O(1)


//public class Array.Searching.Search {
//
//
//    public static void minmax(int[]ar, int n){
//        sort(ar);
//        System.out.println(ar[0]+" "+ar[n-1]);
//    }
//
//
//
//    public static void main(String[] args) {
//        System.out.println("Hello world!");
//        int ar[] = {1,423,6,46,34,23,13,53,4};
//        int n = ar.length;
//        minmax(ar,n);
//
//    }
//}






// Java program to find minimum
// (or maximum) element
// in an array.
import java.util.Arrays;

// 2)basic recursive way
// runtime:O(n), space:O(n) (because recursion creates extra space.

//public class Array.Searching.Search
//{
//
//    static int getMin(int arr[], int i, int n)
//    {
//        // If there is single element, return it.
//        // Else return minimum of first element and
//        // minimum of remaining array.
//        //condition?stat1:stat2
//        //if the condition is true stat1 is executed else stat2 is executed.
//        return (n == 1) ? arr[i] : Math.min(arr[i],
//                getMin(arr,i + 1 , n - 1));
//    }
//
//    static int getMax(int arr[], int i, int n)
//    {
//        // If there is single element, return it.
//        // Else return maximum of first element and
//        // maximum of remaining array.
//        return (n == 1) ? arr[i] : Math.max(arr[i],
//                getMax(arr ,i + 1, n - 1));
//    }
//
//    // Driver code
//    public static void main(String[] args)
//    {
//        int arr[] = { 12, 1234, 45, 67, 1 };
//        int n = arr.length;
//        System.out.print("Minimum element of array: " +
//                getMin(arr, 0, n) + "\n");
//        System.out.println("Maximum element of array: " +
//                getMax(arr, 0, n));
//    }
//}


//3) using stream
//runtime:O(n), space:O(1)
class Search {

    static int getMin(int arr[], int n) {
        //stream creates an array sort of thing.
        //getAsInt aka OptionalInt method provides int value to the existing value.

        /*the Stream is a feature introduced in Java 8 to process a sequence of elements in a functional-style manner.
        It allows you to perform aggregate operations on data in a concise and expressive way.
        A Stream is not a data structure but rather an abstraction of the data that can be operated upon.
        In the given code, the Arrays.stream(arr) method is used to create a stream from the integer array arr.
        Once the stream is created, you can apply various operations on it. In this case, the operations being applied are min() and max().
        */

        return Arrays.stream(arr).min().getAsInt();
    }

    static int getMax(int arr[], int n) {
        return Arrays.stream(arr).max().getAsInt();
    }

    // Driver code
    public static void main(String[] args) {
        int arr[] = {12, 1234, 45, 67, 1};
        int n = arr.length;
        System.out.println("Minimum element of array: " + getMin(arr, n));
        System.out.println("Maximum element of array: " + getMax(arr, n));
    }
}