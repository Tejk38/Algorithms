package LinkedList;

public class RevLL {
    Node head;

    void push(int data){
        Node newnode = new Node(data);

        newnode.next = head;

        head = newnode;


    }

    Node Rev(Node node){
        Node prev = null;
        Node current = node;
        Node next = null;
        while(current!=null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        node = prev;
        return node;

    }


}

class Node2{
    Node next;
    int data;

    Node2(int d){
        data = d;
        next = null;
    }
}
