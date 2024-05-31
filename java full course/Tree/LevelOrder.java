package Tree;

public class LevelOrder {
    Node root;

    public LevelOrder() {
        root = null;
    }

    void printLevelOrder() {
        int h = height(root);
        int i;
        for (i = 1; i < h; i++) {
            printCurrentLevel(root, i);


        }
    }
    // computing height of subtrees or calculating height of the tree
    int height(Node root)
    {
        if (root == null)
            return 0;
        else {
            /* compute  height of each subtree */
            int lheight = height(root.left);
            int rheight = height(root.right);

            /* use the larger one */
            if (lheight > rheight)
                return (lheight + 1);
            else
                return (rheight + 1);
        }
    }
    void printCurrentLevel(Node root, int level){
        if(root == null){
            return;
        }
        if (level == 1){
            System.out.print(root.key+" ");
        } else if (level>1) {
            printCurrentLevel(root.left,level-1);
            printCurrentLevel(root.right,level-1);

        }
    }
    public static void main(String args[])
    {
        LevelOrder tree = new LevelOrder();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.println("Level order traversal of"
                + "binary tree is ");

        tree.printLevelOrder();
    }



}

