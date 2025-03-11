public class LinkedList {
    Node Head=null;
    Node Tail=null;

    public class  Node {
        int data;
        Node next;
        Node prev;

        public Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }

    public void insertBeginning(int data){
        Node node=new Node(data);

        if(Head==null){
            Head=node;
            Tail=node;
            return;
        }

        node.next=Head;
        Head.prev=node;
        Head=node;
    }

    public void insertEnd(int data){
        Node node=new Node(data);

        if(Head==null){
            Head=node;
            Tail=node;
            return;
        }

        Node curNode=Head;

        while(curNode.next!=null){
            curNode=curNode.next;
        }
        curNode.next=node;
        node.prev=curNode;
        Tail=node;
    }

    public void insertAtSpecificLocation(int data,int loc){

        int size=getSize();

        if(loc>size || loc<=0){
            System.out.println("location out of size");
            return;
        }
        Node node=new Node(data);

        if(loc==1){
            node.next=Head;
            Head.prev=node;
            Head=node;
            return;
        }

        Node curNode=Head;
        Node prevNode=null;

        for(int i=0;i<loc-1;i++){
            prevNode=curNode;
            curNode=curNode.next;
        }
        prevNode.next=node;
        curNode.prev=node;
        node.next=curNode;
        node.prev=prevNode;
    }

    public void printNodesFromFront(){
        if(Head==null){
            System.out.println("Nothing to display");
            return;
        }
        Node curNode=Head;

        while (curNode!=null) {
            System.out.print(curNode.data+" --> ");
            curNode=curNode.next;
        }
        System.out.println("null");
    }

    public void printNodesFromEnd(){
        if(Head==null){
            System.out.println("Nothing to display");
            return;
        }
        Node curNode=Tail;

        while (curNode!=null) {
            System.out.print(curNode.data+" --> ");
            curNode=curNode.prev;
        }
        System.out.println("null");
    }
    
    public int getSize(){
        if(Head==null){
            return 0;
        }
        Node curNode=Head;
        int count=0;

        while(curNode.next!=null){
            curNode=curNode.next;
            count++;
        }
        return count+1;
    }

    public void deleteFront(){
        if(Head==null){
            System.out.println("nothing to delete");
            return;
        }
        Head=Head.next;
    }

    public void deleteEnd(){
        if(Head==null){
            System.out.println("nothing to delete");
            return;
        }
        if(Head.next==null){
            Head=null;
            return;
        }
        Node curNode=Head;

        while (curNode.next!=null) {
            curNode=curNode.next;
        }
        Tail=curNode.prev;
        curNode.prev.next=null;
        curNode.prev=null;
    }

    public void deleteSpecific(int loc){
        if(Head==null){
            System.out.println("nothing to delete");
            return;
        }

        if(loc>getSize()){
            System.out.println("location is out of zise");
            return;
        }

        if(loc==1){
            Head=Head.next;
            return;
        }

        Node curNode=Head;
        Node prNode=null;

        for(int i=0;i<loc-1;i++){
            prNode=curNode;
            curNode=curNode.next;
        }
        prNode.next=curNode.next;
        curNode.next.prev=prNode;
    }

    public void searchElement(int data){
        if(Head==null){
            System.out.println("list is empty");
            return;
        }
        Node curNode=Head;

        while(curNode!=null){
            if(curNode.data==data){
                System.out.println("element found");
                return;
            }
            curNode=curNode.next;
        }
        System.out.println("element not found");
    }

    public void reverseList(){
        if(Head==null){
            System.out.println("list is empty");
            return;
        }
        if(Head.next==null){
            return;
        }
        Node front=Head;
        Node back=Tail;

        for(int i=0;i<getSize()/2;i++){
            int temp=front.data;
            front.data=back.data;
            back.data=temp;

            front=front.next;
            back=back.prev;
        }
    }

    public static void main(String[] args) {
        LinkedList dll=new LinkedList();
        dll.insertBeginning(10);
        dll.insertEnd(20);
        dll.insertEnd(30);
        dll.insertAtSpecificLocation(40, 3);
        dll.insertBeginning(5);
        dll.insertEnd(50);
        dll.printNodesFromFront();
        dll.printNodesFromEnd();
        dll.reverseList();
        dll.printNodesFromEnd();
        
    }
}