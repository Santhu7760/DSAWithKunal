public class doublyLinkedList {
    Node head;
    int size;

    doublyLinkedList() {
        this.size = 0;
    }

    public class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
            this.next = null;
            this.prev=null;
            size++;
        }
    }

    public void insertNodeAtFirst(int data){
        Node newdata=new Node(data);

        newdata.next=head;
        if(head!=null){
            head.prev=newdata;
        }
        head=newdata;
    }

    public void printDLL(){
        Node temp=head;

        while (temp!=null) {
            System.out.print(temp.data+" --> ");
            temp=temp.next;
        }
        System.out.print("null");
    }

    public static void main(String[] args) {
        doublyLinkedList dll=new doublyLinkedList();

        dll.insertNodeAtFirst(4);
        dll.insertNodeAtFirst(6);
        dll.insertNodeAtFirst(9);
        dll.insertNodeAtFirst(7);

        dll.printDLL();
    }
}
