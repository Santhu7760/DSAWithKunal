public class LinkedList {

    public Node Head=null;

    public class  Node {
        int data;
        Node next;
        Node perv;

        public Node(int data){
            this.data=data;
            this.next=null;
            this.perv=null;
        }
        
    }

    public void insert(int data){
        Node node=new Node(data);

        if(Head==null){
            Head=node;
            Head.perv=Head;
            Head.next=Head;
            return;
        }
        Node temp=Head;

        while (temp.next!=Head) {
            temp=temp.next;
        }

        node.next=Head;
        Head.perv=node;
        node.perv=temp;
        temp.next=node;
        Head=node;
    }

    public void delete(){
        if(Head==null){
            System.out.println("nothing to delte");
            return;
        }

        if(Head.next==Head){
            Head=null;
            return;
        }

        Head.next.perv=Head.perv;
        Head.perv.next=Head.next;
        Head=Head.next;
    }

    public void display(){
        if(Head==null){
            System.out.println("nothing to display");
            return;
        }
        Node temp=Head;

        while (temp.next!=Head) {
            System.out.print(temp.data+" --> ");
            temp=temp.next;
        }
        System.out.println(temp.data+" --> null ");
    }


    public static void main(String[] args) {
        LinkedList cdll=new LinkedList();

        cdll.insert(10);
        cdll.insert(20);
        cdll.insert(30);
        cdll.insert(40);
        cdll.insert(50);

        cdll.display();

        cdll.delete();

        cdll.display();

        cdll.delete();

        cdll.display();
    }
}