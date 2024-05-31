package Recursion;

public class ProductOf2Num {
    static int  num = 0;
    static int mulnum(int x, int y){
        if(y==0&&y<=x){
            return num;
        }
        num+=x;
        return mulnum(num,y-1);
    }

    public static void main(String[] args) {
        int x = 0;
        int y = 5;
        System.out.println(mulnum(x,y));
    }
}
