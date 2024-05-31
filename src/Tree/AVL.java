package Tree;

// if a sorted input array is given to reduce time complexity we use AVL tree or else to balance the tree in least
// amount of time we use AVL

public class AVL {

    public class Node{
        Node node;
        Node left;
        Node right;
        int height;
        int value;
        Node(int val){
            this.value = val;

        }
        int getValue(){
            return value;

        }

    }
    public Node root;

    public AVL(){

    }

    public int height(){
        return height(root);
    }
    public int height(Node node){
        if(node==null){
            return -1;
        }
        return node.height;
    }

    public void insert(int value){
        root = insert(value,root);
    }

    public Node insert(int value, Node node){
        if(node == null){
            node = new Node(value);
            return node;
        }
        if(node.value>value){
            node.left = insert(value,node.left);

        }
        if(node.value<value){
            node.right = insert(value,node.right);
        }
        node.height = Math.max(height(node.left),height(node.right))+1;

        return rotate(node);
    }

    private Node rotate(Node node){
        if(height(node.left)-height(node.right)>1){
            //left heavy
            if(height(node.left.left)- height(node.left.right)>0){
                //left-left case
                return rightRotate(node);
            } if (height(node.left.left)-height(node.left.right)<0) {
                //left-right case
                node.left=leftRotate(node.left);
                return rightRotate(node);
            }
        }
        if(height(node.left)-height(node.right)<-1){
            //right heavy
            if(height(node.right.left)-height(node.right.right)>0){
                node.right = rightRotate(node.right);
                return leftRotate(node);
            }
            if(height(node.right.left)-height(node.right.right)<0){
                return leftRotate(node);
            }
        }
        return node;
    }

    public Node rightRotate(Node p){
        Node c = p.left;
        Node t = c.right;

        c.right = p;
        p.left=t;

        p.height = Math.max(height(p.left),height(p.right))+1;
        c.height = Math.max(height(c.left),height(c.right))+1;
        return c;

    }

    public Node leftRotate(Node c){
        Node p = c.right;
        Node t = p.left;

        p.left = c;
        c.right=t;

        c.height = Math.max(height(c.left),height(c.right))+1;
        p.height = Math.max(height(p.left),height(p.right))+1;
        return c;

    }

    public void populate(int[] ar){
        for (int i = 0; i < ar.length; i++) {
            this.insert(ar[i]);
        }
    }
    public void populatedSorted(int[] nums) {
        populatedSorted(nums, 0, nums.length);
    }

    private void populatedSorted(int[] nums, int start, int end) {
        if (start >= end) {
            return;
        }

        int mid = (start + end) / 2;

        this.insert(nums[mid]);
        populatedSorted(nums, start, mid);
        populatedSorted(nums, mid + 1, end);

    }

    public void display(){
        display(this.root,"Root Node:");
    }

    public void display(Node node, String details){
        if(node == null){
            return;
        }
        System.out.println(details+node.value);
        display(node.left, "Left child of " + node.value + " : ");
        display(node.right, "Right child of " + node.value + " : ");
    }

    public boolean isEmpty() {
        return root == null;
    }

    public boolean balanced() {
        return balanced(root);
    }

    private boolean balanced(Node node) {
        if (node == null) {
            return true;
        }
        return Math.abs(height(node.left) - height(node.right)) <= 1 && balanced(node.left) && balanced(node.right);
    }


}
