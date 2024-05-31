public class subseq {
    public static void main(String[] args) {
        subs("", "abc");

    }
    public static void subs(String p, String up){
        if (up.isEmpty()){
            System.out.println(p);
            return;

        }
        char ch = up.charAt(0);

        subs(p+ch,up.substring(1));
        subs(p, up.substring(1));
    }
}
