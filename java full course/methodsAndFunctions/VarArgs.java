package methodsAndFunctions;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        //fun(2,3,6,8,0,12);
        multiple(2,3, "tej","bro", "jack");

    }
    // variable length arguments should always come at the end.

    // varargs are used when the number of inputs are not known beforehand.
    // varargs parameter takes inputs into an array.

    // varargs cannot be empty when overriding.
    static void multiple(int a, int b, String ...v){

    }

    static void fun(int ...v){
        System.out.println(Arrays.toString(v));

    }
}
