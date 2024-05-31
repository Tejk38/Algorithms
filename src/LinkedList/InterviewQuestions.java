package LinkedList;

public class InterviewQuestions {

    static Node head;
    static Node tail;
    static int size;

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

    static Node mid(Node head){
        Node fast = head;
        Node slow = head;

        while(fast!=null&&fast.next!=null) {
            fast = fast.next.next;
            slow = slow.next;


        }
        return slow;


    }

    static Node rev(Node head){
        if(size<2){

            return head;
        }
        Node prev = null;
        Node curr = head;
        Node nextNode = curr.next;

        while(curr!=null){
            curr.next = prev;
            prev = curr;
            curr = nextNode;
            if(nextNode!=null){
                nextNode = nextNode.next;
            }
        }
        head = prev;
        return head;
    }


    // Given two indices rev the nodes between the indices.
    // 1->2->3->4->5
    // left = 2, right = 4;
    // output: 1->4->3->2->5

    //https://youtu.be/70tx7KcMROc?list=PL9gnSGHSqcnr_DxHsP7AW9ftq0AtAyYqJ&t=8253
    static Node RevIndex(Node head,int left,int right){
        if(left==right){
            return head;
        }

        Node prev = null;
        Node curr = head;

        for (int i = 0;curr!=null&& i < left-1 ; i++) {
            prev = curr;
            curr = curr.next;
        }
        Node last = prev;
        Node newEnd = curr;

        Node next = curr.next;

        for (int i = 0; curr!=null && i < right-left+1; i++)

        {
            curr.next = prev;
            prev = curr;
            curr = next;

            if(next!=null){
                next = next.next;
            }

        }
        if(last!=null){
            last.next = prev;
        }
        else {
            head = prev;

        }
        newEnd.next = curr;
        return head;
    }



    //https://youtu.be/70tx7KcMROc?list=PL9gnSGHSqcnr_DxHsP7AW9ftq0AtAyYqJ&t=8294
    static boolean ispalindrome(Node node){


        Node mid = mid(head);
        System.out.println(mid.val);
        Node headSecond = rev(mid);

        // storing second head node so that we can reverse it back
        Node rereverseList = headSecond;


        while(head!=null&&headSecond!=null){
            if(head.val != headSecond.val) {
                break;
            }
            head = head.next;
            headSecond = headSecond.next;


        }

        rev(rereverseList);
        return head==null||headSecond==null;
    }


    // https://leetcode.com/problems/reorder-list/
    static void reorderlist(Node head){
        if(head==null||head.next==null){
            return;
        }
        Node s = head;
        Node mid = mid(head);
        Node e = rev(mid);

        while(e!=null&&s!=null){

            Node temp = s.next;
            s.next = e;
            s = temp;

            temp = e.next;
            e.next = s;
            e = temp;

        }
        if(s!=null){
            s.next = null;
        }


    }


    // https://www.geeksforgeeks.org/reverse-alternate-k-nodes-in-a-singly-linked-list/
    public Node reverseAlternateKGroup(Node head, int k) {
        if(head==null||head.next==null){
            return head;
        }
        Node prev = null;
        Node curr = head;
        while (curr.next!=null){
            Node last = prev;
            Node newEnd = curr;

            Node next = curr.next;

            for (int i = 0; curr!=null && i < k; i++) {
                curr.next = prev;
                prev = curr;
                curr = curr.next;
                if(next!=null){
                    next = next.next;
                }

            }
            if(last!=null){
                last = prev;

            }
            else {
                head = prev;
            }

            newEnd.next = curr;

            // skip k elems
            for (int i = 0; curr!=null && i < k; i++) {
                prev = curr;
                curr = curr.next;
            }

        }

        return head;

    }

    static void rotate(Node node, int k){
        if(head==null||head.next==null){
            return;
        }
        Node last = head;
        int length = 1;
        while(last.next!=null){
            last = last.next;
            length++;
        }

        last.next = head;



        Node newLast = head;
        int rotations = k%length; // incase there is a value greater than length of the list.
        int skip = length - rotations;
        for (int i = 0; newLast!=null && i < skip-1 ; i++) {
            newLast = newLast.next;

        }

        head = newLast.next;
        newLast.next = null;



    }


    public static void main(String[] args) {
        InterviewQuestions list = new InterviewQuestions();

        list.push(1);
        list.push(2);
        list.push(3);
        list.push(4);
        list.push(5);

        display();
//        reorderlist(head);
//        display();
//
//        RevIndex(head,2,4);
        rotate(head,2);
        display();

//        System.out.println(ispalindrome(head));






    }

}
