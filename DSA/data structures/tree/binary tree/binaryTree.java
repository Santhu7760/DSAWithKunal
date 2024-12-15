import java.util.Scanner;

public class binaryTree {

    public class Node {
        int value;
        Node left;
        Node right;

        public Node(int value){
            this.value = value;
        }
    }

    Node root;
    public int size;

    public binaryTree(){
        size = 0;
    }

    public int getSize(){
        return size;
    }

    public void insertNode(Scanner scanner){
        System.out.println("Enter value for root node: ");
        int value = scanner.nextInt();
        root = new Node(value);
        size++;  // Increment size for the root node
        insertNode(root, scanner);
    }

    private void insertNode(Node node, Scanner scanner){
        System.out.println("Do you want to insert value to the left of " + node.value + " (1 for yes, 0 for no): ");
        int response = scanner.nextInt();

        if(response == 1){
            System.out.println("Enter the left value of " + node.value + ": ");
            int value = scanner.nextInt();
            node.left = new Node(value);
            size++;  // Increment size when adding a new node

            insertNode(node.left, scanner);
        }

        System.out.println("Do you want to insert value to the right of " + node.value + " (1 for yes, 0 for no): ");
        int response2 = scanner.nextInt();

        if(response2 == 1){
            System.out.println("Enter the right value of " + node.value + ": ");
            int value = scanner.nextInt();
            node.right = new Node(value);  // Correctly assign to the right node
            size++;  // Increment size when adding a new node

            insertNode(node.right, scanner);  // Correctly make the recursive call to the right child
        }
    }

    public void printTree(){
        printTree(root);
        System.out.println();  // Move to the next line after printing the tree
    }

    private void printTree(Node node){
        if(node == null){
            return;
        }
        System.out.print(node.value + " -> ");
        printTree(node.left);
        printTree(node.right);
    }

    public void printTreeInUniqueStyle(){
        System.out.print("{ ROOT -> "+root.value);
        printLeft(root);
        printRight(root);
        System.out.print(", };");;
    }

    private void printLeft(Node node){
        if(node.left==null){
            return;
        }
        System.out.print(", LEFT -> "+node.left.value);
        printLeft(node.left);
    }

    private void printRight(Node node){
        if(node.right==null){
            return;
        }
        System.out.print(",  right -> "+node.right.value);
        printLeft(node.right);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        binaryTree bt = new binaryTree();

        System.out.println("Size before insertion: " + bt.getSize());
        bt.insertNode(scanner);
        bt.printTreeInUniqueStyle();
        System.out.println("Size after insertion: " + bt.getSize());
    }
}
