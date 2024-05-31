package Recursion;

import java.util.Arrays;

//public class RevString {
//    static  String temp ="";
//    public static String[] rev(String[] st, int index){
//        int l = st.length-1;
//        if(index>=st.length-1){
//            return st;
//        }
//        temp = st[index];
//        st[index] = st[l-index];
//        st[l-index] = temp;
//        return rev(st, index+1);
//    }
//
//    public static void main(String[] args) {
//        String[] st = {"h","e","l","l","o"};
//        String[] s = rev(st,0);
//        System.out.println(Arrays.toString(s));
//    }
//}
public class RevString {

    public static char[] print(char[] l, int i, int j){
        char temp;
        if (i==l.length-1||j==0){
            return l;
        }
        temp = l[i];
        l[i] = l[j];
        l[j] = temp;
        return print(l,i+1,j-1);
    }

    public static void main(String[] args) {
        char[] l = {'h','e','l','l','o'};
        System.out.println(Arrays.toString(print(l,0,l.length-1)));
    }
}
















