package LinkedList;

//return nth node from last

public class NthNodeFrLast {
    Node head;
    void printNthFromLast(int N)
    {
        int len = 0;
        Node temp = head;

        // 1) count the number of nodes in Linked List
        while (temp != null) {
            temp = temp.next;
            len++;
        }
        System.out.println(len);

        // check if value of N is not more than length of
        // the linked list
        if (len < N) {
            return;
        }

        temp = head;
        System.out.println(temp.val);

        // 2) get the (len-N+1)th node from the beginning
        for (int i = 1; i < len - N + 1; i++) {
            temp = temp.next;
        }

        System.out.println(temp.val);
    }

    /* Inserts a new Node at front of the list. */
    public void push(int new_data)
    {
        /* 1 & 2: Allocate the Node &
                  Put in the data*/
        Node new_node = new Node(new_data);

        /* 3. Make next of new Node as head */
        new_node.next = head;

        /* 4. Move the head to point to new Node */
        head = new_node;
    }

    // Driver's code
    public static void main(String[] args)
    {
        NthNodeFrLast llist = new NthNodeFrLast();
        llist.push(35);
        llist.push(15);
        llist.push(4);
        llist.push(30);

        // Function call
        llist.printNthFromLast(4);
    }




}
