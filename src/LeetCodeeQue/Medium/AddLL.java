package LeetCodeeQue.Medium;

//https://leetcode.com/problems/add-two-numbers/?envType=study-plan-v2&envId=top-interview-150

//            a = [2,4,3], b = [5,6,4]
//                    sum = [7,0,8]


public class AddLL {

    static class Node{
        int val;
//        Node node;
        Node next;

        Node(int val){
            this.val = val;

        }
    }

    static Node head;
    static void insertFirst(int val){
        if(head!=null){
            Node node = new Node(val);
            node.next = head;
            head = node;

        }
        else{
            head = new Node(val);
        }
    }


    static void traverse(AddLL first, AddLL second){
        
    }


}
