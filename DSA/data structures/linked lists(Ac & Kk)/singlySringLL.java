public class singlySringLL {
    Node head;

    public class Node {
        String data;
        Node next;

        Node(String data){
            this.data=data;
            this.next=null;
        }
    }

    public void insertNodeAtFirst(String data){
        Node node=new Node(data);

        node.next=head;
        head=node;
    }

    public void printAll(){
        if(head==null){
            System.out.print("nothing here to print");
        }

        Node newNode=head;

        while (newNode!=null) {
            System.out.print(newNode.data+" ");
            newNode=newNode.next;
        }
    }

    public void reverse(){
        if(head==null){
            System.out.println("the ll is empty");
        }
        if(head.next==null){
            System.out.println(head.data);
        }

        Node curnode=head.next;
        Node prevnode=head;

        while(curnode!=null){
            Node newNode=curnode.next;
            curnode.next=prevnode;
            prevnode=curnode;
            curnode=newNode;
        }
        head.next=null;
        head=prevnode;
    }


    
    public static void main(String[] args) {
        singlySringLL ssll=new singlySringLL();
        ssll.insertNodeAtFirst("this");
        ssll.insertNodeAtFirst("is");
        ssll.insertNodeAtFirst("java");
        ssll.insertNodeAtFirst("code");
        ssll.reverse();
        ssll.printAll();
    }
}
