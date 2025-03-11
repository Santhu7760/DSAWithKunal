package BinarySearchTree;
public class Tree {

    public Node root;

    public class Node {
        
        public int data;
        public int height;
        public Node left;
        public Node right;
        

        public Node(int data){
            this.data=data;
        }

        public int getNode(){
            return this.data;
        }
    }

    public int getHeight(Node node){
        if(node==null){
            return -1;
        }

        return node.height;
    }

    public void insert(int data){
        
        root=insert(data,root);

    }

    private Node insert(int data,Node node){

        if(node==null){
            return new Node(data);
        }

        if(data<node.data){
            node.left=insert(data, node.left);
        }

        if(data>node.data){
            node.right=insert(data, node.right);
        }

        node.height=Math.max(getHeight(node.left), getHeight(node.right));

        return node;
    }

    public void populate(int arr[]){

        for(int i=0;i<arr.length;i++){
            this.insert(arr[i]);
        }

    }

    public void display(){
        display(this.root,"root node: ");
    }

    private void display(Node node,String str){

        if(node==null){
            return;
        }

        System.out.println(str+node.data);
        display(node.left,"left child of "+node.data+" is: ");
        display(node.right,"right child of "+node.data+" is: ");

    }
    

    public static void main(String[] args) {

        Tree tree=new Tree();     
        int arr[]={30,20,10,25,50,40,60};

        tree.populate(arr);
        tree.display();
    }
}
