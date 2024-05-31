package LinkedList;


// Remove duplicates from sorted list
public class RemDupSorted {

    static class Node{
        int val;
        Node next;
        Node(int val){
            this.val = val;
        }
    }
    static Node head;
    static int size;
    static Node tail;
    static void dup(){
        Node node = head;
        Node curr = head.next;
        while(node.next!=null) {
            if (node.next!=null && node.val == node.next.val) {
                node.next = node.next.next;
                size--;
            }
            else {
                node = node.next;
            }

        }
        tail = node;

        tail.next = null;

    }
    static Node push(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;
        size++;

        return head;
    }
    static void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.val+"->");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        RemDupSorted list = new RemDupSorted();

        list.push(4);
        list.push(4);
        list.push(2);
        list.push(1);
        list.push(1);
        list.push(1);

        list.display();
        dup();
        list.display();

    }
}
