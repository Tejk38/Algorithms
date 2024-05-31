package Tree;

import java.util.Scanner;

public class BinaryTree {

    static class Node{
        Node left;
        Node right;
        int value;
        Node(int val){
            this.value = val;
        }
    }

    static Node root;

    static void populate(Scanner scanner){
        System.out.println("Enter root value: ");
        int value = scanner.nextInt();
        root = new Node(value);
        populate(scanner,root);
    }

    static void populate(Scanner scanner, Node node){
        System.out.println("Do you want to insert a value to the left of"+ node.value);
        boolean left = scanner.nextBoolean();
        if(left){
            System.out.println("Enter the value to be inserted");
            int value = scanner.nextInt();
            node.left = new Node(value);
            populate(scanner, node.left);
        }
        System.out.println("Do you want to insert a value to the right of"+ node.value);
        boolean right = scanner.nextBoolean();
        if(right){
            System.out.println("Enter the value to be inserted");
            int value = scanner.nextInt();
            node.right = new Node(value);
            populate(scanner, node.right);
        }


    }
    static void preOrder(){
        preOrder(root);
    }
    static void preOrder(Node node){
        if(node == null){
            return;
        }
        System.out.println(node.value+"");
        preOrder(node.left);
        preOrder(node.right);
    }

    static void InOrder(){
        InOrder(root);
    }
    static void InOrder(Node node){
        if(node == null){
            return;
        }
        InOrder(node.left);
        System.out.println(node.value+"");

        InOrder(node.right);
    }

    static void PostOrder(){
        PostOrder(root);
    }
    static void PostOrder(Node node){
        if(node == null){
            return;
        }

        PostOrder(node.left);
        PostOrder(node.right);
        System.out.println(node.value+"");
    }

    static void display(){
        display(root, " ");
    }

    static void display(Node node, String indent){
        if(node==null){
            return;
        }

        System.out.println(node.value);
        display(node.left,indent+" \t");
        display(node.right,indent+" \t");
    }

    static void prettydisplay(){
        prettydisplay(root,0);
    }

    static void prettydisplay(Node node, int length){
        if(node==null){
            return;
        }

        prettydisplay(node.right,length+1);

        if(length!=0){
            for (int i = 0; i < length-1; i++) {
                System.out.print("|"+"\t\t");
            }
            System.out.println("|---->"+node.value);
//            return;
        }
        else{
            System.out.println(node.value);
        }

        prettydisplay(node.left,length+1);
    }



}
