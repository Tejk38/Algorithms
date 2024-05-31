package LinkedList;

// Given a linked list and a key ‘X‘ in, the task is to check if X is present in the linked list or not.


public class SearchNode {
    Node head;

    void push(int data){
        Node new_node = new Node(data);
        new_node.next = head;
        head = new_node;
    }
    boolean search(Node head, int key){
        Node current = head;
        while (current!=null) {
            if (current.data == key) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public static void main(String[] args) {


        SearchNode node = new SearchNode();
        int x = 14;
        node.push(14);
        node.push(1);
        node.push(11);
        node.push(17);
        node.push(10);

        if (node.search(node.head, x)){
            System.out.println("yes");
        }
        else {
            System.out.println("NO");
        }

    }


}
class Node1{
    Node next;
    int data;

    void Node(int d){
        data = d;
        next = null;
    }

}