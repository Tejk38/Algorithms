package LinkedList;

import LinkedList.CLL.cLL;
//implemented all basic functions on single likedlist

//Merge two sorted list.

//Delete element from req place
public class LL {
    static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }
        Node(int val, Node next){
            this.val = val;
            this.next = next;
        }
    }
    static Node head;
    static Node tail;

    static int size;

    static void push(int val){
        Node new_node = new Node(val);
        new_node.next = head;
        head = new_node;

        if (tail == null) {
            tail = head;

        }
        size += 1;

    }

    static int deletefirst(){
        int val = head.val;
        head = head.next;
        if(head==null){
            tail = null;
        }
        size--;
        return val;
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

    static int deleteLast(){
        Node SecondLast = get(size - 2);
        int val = SecondLast.next.val;
        SecondLast.next = null;
        tail = SecondLast;

        size--;

       return val;
    }

//    static LL merge(LL left, LL right){
//        Node l = left.head;
//        Node r = right.head;
//
//        LL ans = new LL();
//        while (l!=null && r!=null) {
//            if (l.val <= r.val) {
//                ans.insertlast(l.val);
//
//                l = l.next;
//            }
//            else{
//                ans.insertlast(r.val);
//
//                r=r.next;
//            }
//        }
//        while(l!=null){
//            ans.insertlast(l.val);
//
//            l = l.next;
//        }
//        while(r!=null){
//            ans.insertlast(r.val);
//
//            r = r.next;
//        }
//        return ans;
//    }
public static LL merge(LL first, LL second) {
    Node f = first.head;
    Node s = second.head;

    LL ans = new LL();

    while (f != null && s != null) {
        if (f.val < s.val) {
            ans.insertlast(f.val);
            f = f.next;
        } else {
            ans.insertlast(s.val);
            s = s.next;
        }
    }

    while (f != null) {
        ans.insertlast(f.val);
        f = f.next;
    }

    while (s != null) {
        ans.insertlast(s.val);
        s = s.next;
    }

    return ans;
}

    static void insertlast(int val){
        if(tail == null){
            push(val);
            return;
        }

        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }



    static int delete(int index){

        if(index==0){

            return deletefirst();
        }
        if(index==size-1){
//            deleteLast();
            return deleteLast();
        }

            Node prev = get(index-1);
            int value = prev.next.val;
            prev.next = prev.next.next;

            return value;
    }

    static Node middle(Node head){
        Node s = head;
        Node f = head;

        while(f!=null&&f.next!=null){
            s = s.next;
            f = f.next.next;

        }
        return s;
    }




//    static Node insertfirst(int val){
//        Node temp = head;
//
//    }
    static void insertREC(int val, int index){
        head = insertREC(val,index,head);
    }
    static Node insertREC(int val, int index, Node node){
        if(index==0){
            Node temp = new Node(val,node);
            size++;
            return temp;


        }
        node.next = insertREC(val, index-1, node.next);

        return node;

    }

    static void insert(int index, int val){
        Node node = new Node(val);
        if(index==0){
            push(val);
            return ;
        }

        Node prev = get(index-1);
        Node temp = prev.next;
        prev.next = node;
        node.next = temp;

        size++;
        return;


    }



    static Node get(int index){
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }


    public void display(){
        Node temp = head;

        while (temp!=null){
            System.out.print(temp.val+"->");
            temp = temp.next;
        }

        System.out.print("End");
        System.out.println();
    }


    public static void main(String[] args) {
        LL list = new LL();

        list.push(5);
        list.push(6);
        list.push(7);
        list.push(8);
        list.insert(0,9);

        System.out.println(list.middle(head).val);
        list.display();
        list.insertREC(12,4);
//
//
//
//
//        System.out.println(size);
//
//        System.out.println(deleteLast());
//
//        list.display();
//
//        System.out.println(delete(0));
//
//        list.display();
//
//        System.out.println(delete(1));

//        LL first = new LL();
//        LL second = new LL();
//
//
//
//        first.insertlast(1);
//        first.insertlast(3);
//        first.insertlast(5);
//
//        second.insertlast(1);
//        second.insertlast(2);
//        second.insertlast(9);
//        second.insertlast(14);

       // LL ans = LL.merge(first, second);
        //ans.display();
    }
}
