package LinkedList.CLL;

public class cLL {
    static class Node{
        int val;
        Node next;

        Node(int val){
            this.val = val;
        }
        Node(int val,Node next){
            this.val = val;
            this.next = next;
        }

    }
    static Node head;
    static Node tail;

    cLL(){
        head = null;
        tail = null;
    }
    static void insertLast(int val){
        Node temp = head;
        Node node = new Node(val);

        if(head==null){
            head = node;
            tail = node;

        }
        tail.next = node;
        node.next = head;
        tail = node;


    }

    static void delete(int val){
        Node node = head;
        if(node==null){
            return;
        }
        // condition where the given val is head
        if(node.val==val){
            head = head.next;
            tail.next = head;
        }
        do{
            //temp reference pointer
            Node n = node.next;
            if(n.val == val){
                node.next = n.next;
                break;
            }
            node = node.next;

        }while(node!=null);

    }




    static void display(){
        Node temp = head;
        if(head!=null){
            do {
                System.out.print(temp.val + "->");
                temp = temp.next;
            }while(temp!=head);
            }
        System.out.print("Head");
    }

    public static void main(String[] args) {
        cLL list = new cLL();
        list.insertLast(4);
        list.insertLast(5);
        list.insertLast(8);
        list.insertLast(9);
        list.delete(8);

        list.display();
    }

}
