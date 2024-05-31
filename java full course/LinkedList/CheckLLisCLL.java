package LinkedList;

// check if ll is a cll

public class CheckLLisCLL {
    Node head;

     void push (int data){
        Node new_node = new Node(data);

        new_node.next = head;

        head = new_node;


    }

    boolean check(Node node){
         Node curr = node;

         while(curr!= null){

             if(curr.next != null){
                curr.next = head;
             }

         }
         return false;
    }



}
