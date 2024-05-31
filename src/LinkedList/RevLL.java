package LinkedList;


// REverse Linked list
public class RevLL {

    static Node head;
    static Node tail;
    static int size;

     static void push(int val){

        Node n = new Node(val);

        n.next = head;

        head = n;
        size++;

    }


    static void printLL(Node node){
         Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + "->");
            temp = temp.next;
        }
        System.out.print("End");
        System.out.println();

    }


    static void rev(Node head){
         if(size<2){

             return;
         }
         Node prev = null;
        Node current = head;
         Node nextNode = current.next;

         while(current!=null){
             current.next = prev;
             prev = current;
             current = nextNode;
             if(nextNode!=null){
                 nextNode = nextNode.next;
             }
         }
        head = prev;
    }

    // https://youtu.be/70tx7KcMROc?list=PL9gnSGHSqcnr_DxHsP7AW9ftq0AtAyYqJ&t=6857

    static void RevRec(Node node){
         Node curr;
         if(tail == node){
             head = tail;
             return;

         }
         RevRec(node.next);
         tail.next = node;
         tail = node;
         tail.next = null;



    }





    public static void main(String args[])
    {

        // Start with the empty list
        RevLL list = new RevLL();
        int x = 21;
        /*Use push() to construct below list
        14->21->11->30->10  */
        list.push(85);
        list.push(15);
        list.push(4);
        list.push(20);


        System.out.println("Given linked list");
        list.printLL(head);

        list.rev(head);

//        list.printLL(head);
        System.out.println("");
        System.out.println("Reversed linked list ");
        list.printLL(head);


    }

}
