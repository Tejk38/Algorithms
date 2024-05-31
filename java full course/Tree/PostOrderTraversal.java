package Tree;

public class PostOrderTraversal {
    Node root;

    public PostOrderTraversal() {
        root = null;
    }
     void printTraversal(Node node){
        if(node == null)
            return;

        printTraversal(root.left);

        printTraversal(root.right);

        System.out.print(node.key+"");

    }
    void printTraversal(){
        printTraversal(root);
    }

    public static void main(String[] args) {
        PostOrderTraversal tree = new PostOrderTraversal();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        tree.printTraversal();

    }
}

