package methodsAndFunctions;

public class Shadowing {
    static int x = 90;// will hava its own scope
    public static void main(String[] args) {
        System.out.println(x);
        int x ;
        // the class variable is shadowed at line4 is shadowed by this
      //  System.out.println(x);//scope will begin when variable is initialised
        x = 40;
        System.out.println(x);
        fun();

    }
    static void fun(){
        System.out.println(x);
    }
}
