package Tree;

//https://www.youtube.com/watch?v=ciHThtTVNto&list=PL9gnSGHSqcnqfctdbCQKaw5oZ9Up2cmsq&index=3

public class SegmentTree {

    private class Node{
        Node right;
        Node left;
        int value;
//        int height;
        int startInterval;
        int endInterval;
        Node(int startInterval,int endInterval){
            this.startInterval = startInterval;
            this.endInterval = endInterval;
        }
    }
    Node root;

    public SegmentTree(int[] ar){
        this.root = constructTree(ar,0, ar.length-1);
    }
    private Node constructTree(int[] ar, int start, int end){
        if(start==end){
            Node leaf = new Node(start,end);
            leaf.value = ar[start];
            return leaf;
        }

        // creat new node with the index we are at
        Node node = new Node(start,end);

        int mid = (start+end)/2;

        node.left = this.constructTree(ar,start,mid);
        node.right = this.constructTree(ar,mid+1,end);

        node.value = node.left.value+node.right.value;

        return node;
    }

    public void display(){
        display(this.root);
    }

    public void display(Node node){
        String str = "";

        if(node.left!=null){
            str = str+"Interval=["+node.left.startInterval+"-"+node.left.endInterval+"] and data:"
            +node.left.value+" -> ";
        }else{
            str = str+"No left child ";

        }
        //for current Node
        str = str+"Interval=["+node.startInterval+"-"+node.endInterval+"] and data:"
                +node.value+" -> ";

        if(node.right!=null){
            str = str+"Interval=["+node.right.startInterval+"-"+node.right.endInterval+"] and data:"
                    +node.right.value+" -> ";
        }else{
            str = str+ "No right child ";
        }
        System.out.println(str+'\n');

        //call recursion
        if(node.left!=null){
            display(node.left);
        }
        if(node.right!=null){
            display(node.right);
        }

    }

    //query
    public int query(int qsi,int qei){
        return this.query(this.root,qsi,qei);
    }
    private int query(Node node, int qsi, int qei){
        if(node.startInterval>=qsi && node.endInterval<=qei){
            return node.value;
        }
        else if(node.startInterval>qei || node.startInterval<=qsi){
            return 0;
        }
        else{
            return query(node.left,qsi,qei)+ query(node.right,qsi,qei);
        }
    }
    private void update(int index, int value){
        this.root.value = update(this.root,index,value);
    }

    private int update(Node node, int index, int value){
        if(index>=node.startInterval && index<= node.endInterval){
            if(index==node.startInterval && index==node.endInterval){
                node.value = value;
                return node.value;
            }else{
                int leftAns = update(node.left,index,value);
                int rightAns = update(node.right,index,value);
                node.value = leftAns+rightAns;
            }
            return node.value;

        }
        return node.value;
    }

}
