package OOP.Inheritence;

public class Main {
    public static void main(String[] args) {
        Box box = new Box(4.6,7.9,6.5);
        Box box1 = new Box(box);
        System.out.println(box1.l+ " "+ box1.h+" "+ box1.w);
        BoxWeight box2 = new BoxWeight();
        System.out.println(box2.weight + " "+ box2.w  );
    }

}
