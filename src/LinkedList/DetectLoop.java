package LinkedList;

// using flag for visited node time:O(n) space:O(1)
//public class DetectLoop {
//
//    static Nodel push(Nodel head,int val){
//        Nodel node = new Nodel(val);
//        node.flag = 0;
//        node.val = val;
//        node.next = head;
//        head = node;
//
//        return head;
//
//    }
//
//
//    static boolean loop(Nodel h){
//
//        while(h!=null){
//
//            if(h.flag == 1){
//                return true;
//
//            }
//            else{
//
//                h.flag = 1;
//                h = h.next;
//
//            }
//
//        }
//        return false;
//
//
//
//    }
//    public static void main(String[] args)
//    {
//
//        // Start with the empty list
//        Nodel head = null;
//
//        head = push(head, 20);
//        head = push(head, 4);
//        head = push(head, 15);
//        head = push(head, 10);
//
//        // Create a loop for testing
//        head.next.next.next.next = head;
//
//        if (loop(head))
//            System.out.print("Loop Found");
//        else
//            System.out.print("No Loop");
//    }
//
//
//
//}
//
//class Nodel{
//    int val;
//    Nodel next;
//    int flag;
//
//    Nodel(int val){
//        this.val = val;
//
//    }
//}


//import java.util.HashMap;
//import java.util.HashSet;
//
//// using hashing time:O(n) space:O(n)
//public class DetectLoop{
//    static Node head; // head of list
//
//    /* Linked list Node*/
//    static class Node {
//        int data;
//        Node next;
//        Node(int d)
//        {
//            data = d;
//            next = null;
//        }
//    }
//
//    /* Inserts a new Node at front of the list. */
//    static public void push(int new_data)
//    {
//        /* 1 & 2: Allocate the Node &
//                  Put in the data*/
//        Node new_node = new Node(new_data);
//
//        /* 3. Make next of new Node as head */
//        new_node.next = head;
//
//        /* 4. Move the head to point to new Node */
//        head = new_node;
//    }
//
//    // Returns true if there is a loop in linked
//    // list else returns false.
//    static boolean detectLoop(Node h)
//    {
//        HashSet<Node> s = new HashSet<Node>();
//        while (h != null) {
//            // If we have already has this node
//            // in hashmap it means there is a cycle
//            // (Because  we are encountering the
//            // node second time).
//            if (s.contains(h))
//                return true;
//
//            // If we are seeing the node for
//            // the first time, insert it in hash
//            s.add(h);
//
//            h = h.next;
//        }
//
//        return false;
//    }


// consider 2 pointers 1)fast 2)slow
// we move fast pointer by 2x everytime and slow by x.
// So, they meet at some point if there is a loop.

public class DetectLoop {
    static class Node{
        Node next;
        int val;
        Node(int val){
            val = val;
            next = null;
        }
    }
    static Node head;
    static int size;

    static boolean loop(Node head){
        Node fast = head;
        Node slow = head;

        while(fast!=null && fast.next!=null){

            fast = fast.next.next;
            slow = slow.next;

            if(fast == slow){
                Node temp = slow;
                slow = slow.next;
                do{

                    slow = slow.next;
                    size++;
                }while (temp!=fast);
                System.out.println(size);
                return true;

            }
            size++;




        }
        System.out.println(size);
        return false;


    }

    static public void push(int new_data)
    {
        /* 1 & 2: Allocate the Node &
                  Put in the data*/
        Node new_node = new Node(new_data);

        /* 3. Make next of new Node as head */
        new_node.next = head;

        /* 4. Move the head to point to new Node */
        head = new_node;
    }


    /* Driver program to test above function */
    public static void main(String[] args)
    {
        DetectLoop llist = new DetectLoop();

        llist.push(20);
        llist.push(4);
        llist.push(15);
        llist.push(10);

        /*Create loop for testing */
        llist.head.next.next.next.next = llist.head;

        System.out.println(loop(head));
//        if (loop)
//            System.out.println("Loop Found");
//        else
//            System.out.println("No Loop");
    }


}