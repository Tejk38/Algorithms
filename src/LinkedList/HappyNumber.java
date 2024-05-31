package LinkedList;

public class HappyNumber {

    static Node head;
    static boolean happynum(int n){

        int f = n;
        int s = n;


        do{
            s = square(s);
            f = square(square(f));
        }while (f!=s);
        if(s==1){
            return true;
        }
        return false;
    }


    static int square(int num){
        int s = 0;
        while(num>0){
            int rem = num%10;
            s += rem*rem;
            num = num/10;

        }
        return s;
    }

}
