package LinkedList;


// find the middle node in a linked list
public class FindMiddleElement {

    static Node head;
    static Node tail;

    static int size;
    static Node mid(Node head){
        Node fast = head;
        Node slow = head;

        while(fast!=null&&fast.next!=null) {
            fast = fast.next.next;
            slow = slow.next;


        }
        return slow;


    }
    static void push(int val){
        Node node = new Node(val);
        node.next =head;
        head = node;

        if(tail==null){
            tail = head;
        }
        size++;

    }

    static void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.val+"->");
            temp = temp.next;
        }
        System.out.println("End");
    }


    public static void main(String[] args) {
        FindMiddleElement list = new FindMiddleElement();

//        list.push(4);
        list.push(5);
        list.push(4);
        list.push(3);
        list.push(2);
        list.push(1);

        display();
        System.out.println(mid(head).val);




    }




}
