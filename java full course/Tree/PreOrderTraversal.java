package Tree;

public class PreOrderTraversal {
    Node root;
    public PreOrderTraversal() {
        root = null;
    }
    void printTraversal(Node node){
        if(node == null)
            return;

        System.out.println(root.key+" ");

        printTraversal(root.left);

        printTraversal(root.right);
    }
}
