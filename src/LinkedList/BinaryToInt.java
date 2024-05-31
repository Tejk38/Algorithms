package LinkedList;

public class BinaryToInt {
    static Node head;
    static Node tail;
    static int size;
    public static int getDecimalValue(Node head) {

        int value=0;
        Node temp = head;
        int i = getsize(head)-1;
        if(i<1){
            if(temp.val==1){
                return 1;

            }
            else{
                return 0;
            }
        }
        while(temp!=null){
            int val = temp.val;
            switch(val){

                case(1):
                    value += Math.pow(2,i);
                    i--;
                    break;

                case(0):
                    value += 0;
                    i--;
                    break;


            }
            temp = temp.next;
        }
        return value;
    }

    static int getsize(Node head){
        Node curr = head;
        int size = 0;
        while(curr!=null){
            size+=1;
            curr=curr.next;
        }
        return size;
    }

    static void push(int val){
        Node new_node = new Node(val);
        new_node.next = head;
        head = new_node;

        if (tail == null) {
            tail = head;

        }
        size += 1;

    }

    static void InsertLast(int val){
        if (tail == null) {
            push(val);
            return;
        }
        Node node = new Node(val);

        tail.next = node;
        tail = node;
        size++;

    }

    public static void main(String[] args) {
        BinaryToInt list = new BinaryToInt();
        int[] nodes = {1,0,0,1,0,0,1,1,1,0,0,0,0,0,0};
        for (int i : nodes) {
            list.InsertLast(i);

        }
        System.out.println(getDecimalValue(head));

    }
}
