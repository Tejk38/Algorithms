package LinkedList;

// search for reqd element in a linked list
public class SearchElem {

    Node head; // Head of list

    // Inserts a new node at the front of the list
    public void push(int new_data)
    {
        // Allocate new node and putting data
        Node new_node = new Node(new_data);

        // Make next of new node as head
        new_node.next = head;

        // Move the head to point to new Node
        head = new_node;
    }

    // Checks whether the value x is present in linked list
    public boolean search(Node head, int x)
    {
        Node current = head; // Initialize current
        while (current != null) {
            if (current.val == x)
                return true; // data found
            current = current.next;
        }
        return false; // data not found
    }

    // Driver code
    public static void main(String args[])
    {

        // Start with the empty list
        SearchElem llist = new SearchElem();
        int x = 21;
        /*Use push() to construct below list
        14->21->11->30->10  */
        llist.push(10);
        llist.push(30);
        llist.push(11);
        llist.push(21);
        llist.push(14);

        // Function call
        if (llist.search(llist.head, x))
            System.out.println("Yes");
        else
            System.out.println("No");
    }

}


class Node{

    Node next;
    int val;

    Node(int v){

        val = v;

    }
    Node(){

    }

}