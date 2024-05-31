package BinaryTree;

public class InOrderTraversal {
    Node root;

    public InOrderTraversal() {
        root = null;
    }
    /*Given a binary tree, printing its nodes in inroder*/
    void printInorder(Node node){
        if(node == null){
            return;
        }
        printInorder(node.left);

        System.out.print(node.key + " ");

        printInorder(node.right);




    }
    void printInorder(){
        printInorder(root);
    }

    public static void main(String[] args) {
        InOrderTraversal tree = new InOrderTraversal();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.println("\nInOrder traversal of binary tree is:");
        tree.printInorder();
    }

}
class Node{
    int key;
    Node left, right;

    public Node(int item){
        key = item;
        left = right = null;
    }

}

