public class LinkedList {

    public Node Head=null;

    public class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    public void insertBeginning(int data){
        Node node=new Node(data);

        if(Head==null){
            Head=node;
            Head.next=Head;
            return;
        }

        if(Head.next==Head){
            node.next=Head;
            Head.next=node;
            Head=node;
            return;
        }

        Node curr=Head;

        while(curr.next!=Head){
            curr=curr.next;
        }

        node.next=Head;
        curr.next=node;
        Head=node;
    }

    public void insertEnd(int data){
        Node node =new Node(data);

        if(Head==null){
            Head=node;
            Head.next=Head;
            return;
        }

        if(Head.next==Head){
            Head.next=node;
            node.next=Head;
            return;
        }

        Node curr=Head;
        while (curr.next!=Head) {
            curr=curr.next;
        }

        curr.next=node;
        node.next=Head;
    }

    public void insertAtSpecificLocation(int data,int loc){
        if(Head==null){
            System.out.println("Sorry location not found");
            return;
        }
        
        int size=getSize();
        Node node=new Node(data);

        if(loc<=size){
            Node currNode=Head;
            Node prevNode=null;

            for(int i=0;i<loc-1;i++){
                prevNode=currNode;
                currNode=currNode.next;
            }
            prevNode.next=node;
            node.next=currNode;
            return;
        }
        Node currNode=Head;

        while (currNode.next!=Head) {
            currNode=currNode.next;
        }

        currNode.next=node;
        node.next=Head;
    }

    public int getSize(){
        if(Head==null) return 0;

        if(Head.next==Head) return 1;

        Node currNode=Head;
        int count=0;

        while (currNode.next!=Head) {
            count++;
            currNode=currNode.next;
        }
        return count+1;
    }

    public void display(){
        if(Head==null){
            System.out.println("Nothing to display");
            return;
        }
        Node curNode=Head;

        while (curNode.next!=Head) {
            System.out.print(curNode.data+" --> ");
            curNode=curNode.next;
        }
        System.out.println(curNode.data+" --> null");
    }

    public void deleteFront(){
        if(Head==null){
            System.out.println("there is nothing to delete");
            return;
        }

        if(Head.next==Head){
            Head=null;
            return;
        }
        Node currNode=Head;

        while(currNode.next!=Head){
            currNode=currNode.next;
        }
        Head=Head.next;
        currNode.next=Head;
    }

    public void deleteRear(){
        if(Head==null){
            System.out.println("there is nothing to delete");
            return;
        }
        if(Head.next==Head){
            Head=null;
            return;
        }
        Node currNode=Head;
        Node prevNode=null;

        while(currNode.next!=Head){
            prevNode=currNode;
            currNode=currNode.next;
        }
        prevNode.next=Head;
    }

    public void deleteFromParticularLocation(int loc){
        if(Head==null){
            System.out.println("nothing to delete");
            return;
        }

        int size=getSize();

        if(loc>size){
            System.out.println("location is out of size");
            return;
        }
        if(loc<1){
            System.out.println("input valid location");
            return;
        }
        if(loc==1 && Head.next==Head){
            Head=null;
            return;
        }
        if(loc==1){
            deleteFront();
            return;
        }
        Node curNode=Head;
        Node prNode=null;

        for(int i=0;i<loc-1;i++){
            prNode=curNode;
            curNode=curNode.next;
        }
        prNode.next=curNode.next;
    }

    public void searchNode(int data){
        if(Head==null){
            System.out.println("nothing to search");
            return;
        }
        Node currNode=Head;
        int location=0;

        while(currNode.next!=Head){
            location++;
            if(currNode.data==data){
                System.out.println("element found at location: "+location);
                return;
            }
            currNode=currNode.next;
        }
        if(currNode.data==data){
            System.out.println("element found at location: "+location);
        }else{
            System.out.println("element not found");
        }
    }

    public void updateData(int data,int newData){
        if(Head==null){
            System.out.println("nothing to update");
            return;
        }
        Node currNode=Head;

        while(currNode.next!=Head){
            if(currNode.data==data){
                currNode.data=newData;
                return;
            }
            currNode=currNode.next;
        }
        if(currNode.data==data){
            currNode.data=newData;
        }else{
            System.out.println("element not found");
        }
    }

    public static void main(String[] args) {
        LinkedList cll=new LinkedList();

        cll.insertBeginning(10);
        cll.insertBeginning(20);
        cll.insertEnd(30);
        cll.insertAtSpecificLocation(40, 04);
        cll.display();
    //     cll.deleteFront();
    //     cll.display();
    //     cll.deleteRear();
    //     cll.display();
    //     cll.deleteFromParticularLocation(3);
    //     cll.deleteFromParticularLocation(1);
    //     cll.display();
        cll.searchNode(20);
    }

}

