public class singlyLinkedLists {
    Node head;
    int size;

    singlyLinkedLists() {
        this.size = 0;
    }

    public class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }

    public void insertNodeAtFirst(int data) {
        Node newNode = new Node(data);

        newNode.next = head;
        head = newNode;
    }

    public void insertNodeAtLast(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node currNode = head;

        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    public void printNode() {

        Node currNode = head;

        while (currNode != null) {
            System.out.print(currNode.data + " --> ");
            currNode = currNode.next;
        }
        System.out.println("null");
    }

    public void removeFirstNode() {
        if (head == null) {
            System.out.println("Nothing to remove");
        }
        head = head.next;
        size--;
    }

    public void removeLastNode() {
        Node currNode = head;
        Node lastNode = head.next;

        if (head == null) {
            System.out.println("nothing to delete");
            return;
        }

        size--;

        if (head.next == null) {
            head = null;
            return;
        }

        while (lastNode.next != null) {

            currNode = currNode.next;
            lastNode = lastNode.next;

        }
        currNode.next = lastNode.next;
    }

    public void printSize() {
        System.out.println(size);
    }

    public void removeInMiddle(int n) {
        if (head == null) {
            System.out.println("nothing to remove");
        }

        if (n == head.data) {
            head = null;
        }

        Node curNode = head;
        Node delNode = head.next;

        while (curNode.next != null) {
            if (curNode.next.data == n) {
                curNode.next = delNode.next;
                return;
            }
            curNode = curNode.next;
            delNode = delNode.next;
        }

    }

    public void midvalue() {
        if (head == null) {
            System.out.println("nothing to remove");
        }

        Node slow = head;
        Node fast = head;

        while (fast.next != null) {
            slow = slow.next;
            if (fast.next.next == null) {
                head = slow;
                return;
            }
            fast = fast.next.next;
        }
        head = slow;

    }

    public void removeParticularNode(int data) {
        if (head == null) {
            System.out.println("executed!");
            return;
        }

        Node curnode = head.next;
        Node prevNode=head;

        while(head.data==data){
            if (head.next != null) {
                head= head.next;
            }else{
                head = null;
            }
        }

        while (curnode != null) {
             if (curnode.data == data) {
                prevNode.next = curnode.next;
            }
            curnode = curnode.next;
            prevNode=prevNode.next;
        }
        System.out.println("finished!");
    }

    public static void printElementsUsingRecursion(Node curNode){
        if(curNode==null){
            System.out.print("Null");
            return;
        }
        System.out.print(curNode.data+" --> ");
        printElementsUsingRecursion(curNode.next);
    }

    public boolean palindrome(){
        if(head==null){
            return true;
        }
        if(head.next==null){
            return true;
        }

        Node temp=head;

        for (int i = 1; i < size/2; i++) {
            temp=temp.next;
        }

        Node newEnd=temp.next;
        temp.next=null;

        Node curNode=newEnd;
        Node prevNode=null;

        newEnd.next=null;

        while(curNode!=null){
            Node newNode=curNode.next;
            curNode.next=prevNode;
            prevNode=curNode;
            curNode=newNode;
        }
        

        Node firstList=head;
        Node secondList=prevNode;

        while (firstList!=null && secondList!=null) {
            if(firstList.data==secondList.data){
                firstList=firstList.next;
                secondList=secondList.next;
            }else{
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        singlyLinkedLists sll = new singlyLinkedLists();
        sll.insertNodeAtFirst(1);
        sll.insertNodeAtFirst(2);
        sll.insertNodeAtFirst(3);
        sll.insertNodeAtFirst(2);
        sll.insertNodeAtFirst(1);
        System.out.println(sll.palindrome());


    }
}
