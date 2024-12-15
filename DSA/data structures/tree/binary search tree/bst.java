import java.lang.annotation.Retention;

/**
 * bst
 */
public class bst {

    Node root=null;
    int size=0;

    public static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }

    public void insertNode(int data){
        Node node=new Node(data);
        if(root==null){
            root=node;
            return;
        }
        insertNode(root,node,data);
    }

    private void insertNode(Node rootNode,Node node,int data){
        if(rootNode==null){
            rootNode=node;
            return;
        }
        if(data==rootNode.data){
            System.out.println("DUPLICATE DATA IS NOT ALLOWED!");
            return;
        }
        if(data<rootNode.data){
            insertNode(rootNode.left, node, data);
        }else{
            insertNode(rootNode.right, node, data);
        }
    }

    public void printNodes(){
        if(root==null){
            System.out.println("THERE IS NOTHING HERE TO DISPLAY");
            return;
        }
        printNodes(root);
        System.out.print("null");
    }

    private void printNodes(Node node){
        if(node==null){
            return;
        }
        System.out.print(node.data+" -> ");
        printNodes(node.left);
        printNodes(node.right);
    }

    public static void main(String[] args) {
        bst bst1=new bst();
        bst1.insertNode(1);
        bst1.insertNode(2);
        bst1.insertNode(5);
        bst1.printNodes();
    }
}