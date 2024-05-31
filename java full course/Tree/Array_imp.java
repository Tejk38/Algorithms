package Tree;

public class Array_imp {
    static int root = 0;
    static String[] str = new String[10];

    public void Root(String key){
        str[0] = key;
    }

    public void set_left(String key, int root){
        int t = (root*2) +1;

        if(str[root] == null){
            System.out.printf("can't set at %d, no parent found\n", t);

        }
        else{
            str[t] = key;
        }
    }
    public void set_right(String key, int root){
        int t = (root*2) +2;

        if(str[root] == null){
            System.out.printf("can't set at %d, no parent found\n", t);

        }
        else{
            str[t] = key;
        }
    }
    public void print_Tree(){
        for (int i = 0; i < 10; i++) {
            if (str[i] !=null){
                System.out.print(str[i]);
            }
            else
                System.out.print("-");

        }
    }
}
