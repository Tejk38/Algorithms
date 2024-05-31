package methodsAndFunctions;

public class Overloading {
    public static void main(String[] args) {
        fun(2);
        fun("bro");

    }

    // At compile time the compiler decides which function to run.

    // In method overloading functions cannot have same number of arguments if they have same data type. But, if they have
    //    different data types the number of arguments can be same.

    static void fun(int n){
        System.out.println(n);

    }
    static void fun(String name){
        System.out.println(name);
    }
}
