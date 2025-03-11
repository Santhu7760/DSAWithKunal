package BinaryTree;
import java.util.Scanner;

public class Tree {
    
    public class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data=data;
        }

    }

    public static Node root;

    public void insert(Scanner scanner){

        System.out.println("enter the root node value: ");

        int data=scanner.nextInt();

        root=new Node(data);

        insert(scanner,root);
    }

    private void insert(Scanner scanner,Node node){

        System.out.println("do you want to insert data to the left of: "+node.data);
        boolean left=scanner.nextBoolean();

        if(left){
            System.out.println("enter the left node value of node: "+node.data);
            int data=scanner.nextInt();
            node.left=new Node(data);

            insert(scanner, node.left);
        }

        System.out.println("do you want to insert data to the right of: "+node.data);
        boolean right=scanner.nextBoolean();

        if(right){
            System.out.println("enter the right node value of node: "+node.data);
            int data=scanner.nextInt();
            node.right=new Node(data);

            insert(scanner, node.right);
        }

    }

    public void display(Node root){
        if(root==null){
            return;
        }
        display(root.left);
        System.out.print(root.data+" --> ");
        display(root.right);
    }

    public static void main(String[] args) {

        Tree tree=new Tree();
        Scanner scanner=new Scanner(System.in);

        tree.insert(scanner);
        tree.display(root);
        System.out.println("null");
    }

}