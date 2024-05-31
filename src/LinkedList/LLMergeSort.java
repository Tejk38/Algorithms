package LinkedList;





public class LLMergeSort {
    static class Node {
        Node next;
        int value;

        Node(int val) {
            this.value = val;
        }
    }

    static Node head;

    static Node mergeSort(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node middle = getMid(head);
        Node nextOfMiddle = middle.next;
        middle.next = null;

        Node left = mergeSort(head);
        Node right = mergeSort(nextOfMiddle);

        Node sortedList = merge(left, right);
        return sortedList;
    }

    static Node merge(Node left, Node right) {
        Node result = null;
        if (left == null) {
            return right;
        }
        if (right == null) {
            return left;
        }

        if (left.value <= right.value) {
            result = left;
            result.next = merge(left.next, right);
        } else {
            result = right;
            result.next = merge(left, right.next);
        }

        return result;
    }

    static Node getMid(Node node) {
        Node slow = node;
        Node fast = node;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    static void insertLast(int val) {
        Node new_node = new Node(val);
        if (head == null) {
            head = new_node;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = new_node;
    }

    static void display() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.value + "->");
            temp = temp.next;
        }
        System.out.print("End");

    }

    public static void main(String[] args) {

        LLMergeSort li = new LLMergeSort();
        /*
         * Let us create a unsorted linked list to test the functions
         * created. The list shall be a: 2->3->20->5->10->15
         */
        li.insertLast(15);
        li.insertLast(10);
        li.insertLast(5);
        li.insertLast(20);
        li.insertLast(3);
        li.insertLast(2);

        li.display();
        // Apply merge Sort
        li.head = li.mergeSort(li.head);

        System.out.print("\n Sorted Linked List is: \n");

        li.display();
    }

}
