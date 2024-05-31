package Recursion;
// finding uppercase letter in a string
//public class UpperCaseLetter {
//    static String st = "";
//    static String first(String str, int index){
//
//        if(index == str.length()-1){
//            return st;
//        }
//
//        if(Character.isUpperCase(str.charAt(index) )){
//                st += str.charAt(index);
//
//            }
//        return first(str,index+1);
//
//        }
//
//    public static void main(String[] args) {
//        String str = "geeksforgeeKs";
//        String res = first(str,0);
//        if(res ==" "){
//            System.out.println("No uppercase letter");
//
//        }
//        else{
//            System.out.println(res);
//        }
////        first(str,0);
////        System.out.println(first(str,0));
//    }
//}

public class UpperCaseLetter {

    static char uppercaseletter(String w, int index){
        if(w.charAt(index) == '\0'){
            return 0;
        }
        if(Character.isUpperCase(w.charAt(index))){
            return w.charAt(index);
        }
        try{
            uppercaseletter(w,index+1);
        }
        catch (Exception e){
            System.out.println("Exception occurs");
        }
        return 0;

    }

    public static void main(String[] args) {
        String str = "geeksforGeeKS";
        char res = uppercaseletter(str,0);
        if (res == 0)
            System.out.println("No uppercase letter");
        else
            System.out.println (res);
    }


}
