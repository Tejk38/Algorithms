package LinkedList.DLL;

public class dLL {

    static class Node{

        int val;
        Node next;
        Node prev;

        Node(int val){
            this.val = val;
        }

    }
    static Node head;
    static int size;

    static void insertfirst(int val){
        Node node = new Node(val);


        node.next = head;
        node.prev = null;
        if(head!=null){
            head.prev = node;
        }
        head = node;

        size++;
    }
    
    static void insertlast(int val){
        Node node = new Node(val);
        // we don't have tail node by default.so we traverse till the end of the original list
        Node tail = head;
        while(tail.next!=null){
            tail = tail.next;
        }
        tail.next = node;
        node.prev = tail;
        node.next = null;
        tail = node;

        size++;
    }
    static Node find(int val){
        Node temp = head;
        while(temp!=null){
            if (temp.val == val){
                return temp;
            }
            temp = temp.next;
        }
        
        return null;
    }
    
    // after is the value of the node after which the node should be inserted
    static void insert(int after,int val){
        Node node = new Node(val);
        Node p = find(after);

        if(p==null){
            System.out.println("not found");
            return;
        }

        node.next = p.next;
        p.next = node;
        node.prev = p;

        //condition for adding node at tail position
        if(node.next!=null) {
            node.next.prev = node;
        }
        size++;

    }
    static void display(){
        Node temp = head;

        while(temp!=null){
            System.out.print(temp.val+"->");
            temp = temp.next;
        }
        System.out.print("End");
        System.out.println();
    }

    static Node get(int val){
        Node temp = head;
        for (int i = 0; i < val; i++) {
            temp = temp.next;
        }
        return temp;
    }



    static void delete(int index){
        if(index==0){
            head = head.next;
            head.next.prev = null;
            return;
        }
        if(index==size-1){
            Node p = get(index-1);
            p.next = null;
            return;

        }


//        Node node = new Node(val);
        Node p = get(index-1);

        p.next = p.next.next;
        p.next.prev = p;

    }


    public static void main(String[] args) {
        dLL list = new dLL();
        list.insertfirst(5);
        list.insertfirst(7);
        list.insertfirst(9);
        list.insertfirst(8);
        list.insertlast(10);
        list.insert(7,11);


        list.display();
        list.delete(size-1);
        list.display();

    }

}
