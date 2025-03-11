import java.util.Scanner;

public class Queues {

    Node Head = null;

    public class Node {

        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void enqueue(int data) {
        Node node = new Node(data);

        System.out.println(data + " inserted successfully");

        if (Head == null) {
            node.next = Head;
            Head = node;
            return;
        }

        Node currNode=Head;
        Node prevNode=null;

        while (currNode!=null) {
            prevNode=currNode;
            currNode=currNode.next;
        }

        prevNode.next=node;

    }

    public void dequeue() {
        if (Head == null) {
            System.out.println("stack underflow");
            return;
        }

        System.out.println(Head.data + " delted successfully");

        Head = Head.next;

    }

    public void display() {
        if (Head == null) {
            System.out.println("nothing to display");
            return;
        }

        Node temp = Head;

        while (temp != null) {
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public int getSize() {
        if (Head == null) {
            System.out.println("nothing to display");
            return -1;
        }

        Node temp = Head;
        int count = 0;

        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    public boolean isEmpty() {
        return Head == null;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Queues queues = new Queues();

        int opt;

        while (true) {
            System.out.println("enter 1 --> insert 2 --> delete 3 --> display 4 --> isEmpty 5 --> getSize: ");
            opt = scanner.nextInt();

            if (opt == 1) {
                System.out.println("enter value to insert: ");
                int val = scanner.nextInt();
                queues.enqueue(val);
            } else if (opt == 2) {
                queues.dequeue();
            } else if (opt == 3) {
                queues.display();
            } else if (opt == 4) {
                System.out.println("is queue empty: " + queues.isEmpty());
            } else if (opt == 5) {
                System.out.println("current size of the queue is: " + queues.getSize());
            } else {
                break;
            }
        }

        scanner.close();

    }

}
