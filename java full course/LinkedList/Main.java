package LinkedList;

public class Main {
    public static void main(String[] args) {
        LL list = new LL();
        list.insertFirst(15);
        list.insertFirst(10);
        list.insertFirst(5);
        list.insertFirst(8);
        list.display();
        System.out.println(list.deleteLast());
        list.display();
    }
}
