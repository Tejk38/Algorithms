package methodsAndFunctions;
import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        //System.out.println(greet());

        Scanner in  = new Scanner(System.in);
        System.out.print("enter a name:");
        String name = in.next();

        String personlaised = myGreet(name);
        System.out.println(personlaised);
    }

    static String myGreet(String name) {
        String message  = "Hello" + name;
        return message;

    }

    static String greet(){

        String greeting = "how are you?";

        return greeting;

    }
}
