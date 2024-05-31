package LinkedList;

//find the length of Linked list
public class LengthOfLL {

    Node head;

     void push(int val){

        Node n = new Node(val);

        n.next = head;

        head = n;




    }

     int count(){

        Node temp = head;
        int count = 0;
        while(temp != null){

            count++;

            temp = temp.next;

        }

        return count;

    }
    public static void main(String[] args)
    {
        /* Start with the empty list */
        LengthOfLL llist = new LengthOfLL();
        llist.push(1);
        llist.push(3);
        llist.push(1);
        llist.push(2);
        llist.push(1);

        // Function call
        System.out.println("Count of nodes is "
                + llist.count());
    }



}
