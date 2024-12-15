/**
 * stackAndQueueUsingLL
 */
public class stackAndQueueUsingLL {

    class stackNode {
        int data;
        stackNode next;

        stackNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    class queueNode {
        int data;
        queueNode next;

        queueNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    stackNode stackHead;
    stackNode stackTail;
    int stackSize;

    queueNode queueHead;
    queueNode QueueTail;
    int QueueSize;

    stackAndQueueUsingLL() {
        stackSize = 0;
        QueueSize = 0;
    }

    public boolean pushDataIntoStack(int data) {
        stackNode node = new stackNode(data);

        if (stackHead == null) {
            stackTail = node;
        }

        node.next = stackHead;
        stackHead = node;
        stackSize++;

        return true;
    }

    public boolean insertDataIntoQueue(int data) {
        queueNode node = new queueNode(data);

        if (queueHead == null) {
            node.next = queueHead;
            queueHead = node;
            QueueTail = node;
            QueueSize++;
            return true;
        }

        QueueTail.next = node;
        QueueTail = node;
        QueueSize++;
        return true;
    }

    public int popDataFromStack() {
        if (stackHead == null) {
            System.out.println("nothing here to delete");
            return -1;
        }
        if (stackSize == 1) {
            stackNode newNode = stackHead;
            stackHead = null;
            stackTail = null;
            stackSize--;
            return newNode.data;
        }
        stackHead = stackHead.next;
        stackSize--;
        return stackHead.data;
    }

    public int removeDataFromQueue() {
        if (QueueTail == null) {
            System.out.println("nothing here to delete");
            return -1;
        }

        if (QueueSize == 1) {
            queueNode newNode = QueueTail;
            QueueTail = null;
            queueHead = null;
            QueueSize--;
            return newNode.data;
        }

        queueNode temp = queueHead;
        int i = 1;

        while (i < QueueSize - 1) {
            temp = temp.next;
            i++;
        }
        queueNode newNode = QueueTail;
        QueueTail = temp;
        QueueTail.next = null;
        QueueSize--;
        return newNode.data;
    }

    public void printStackData() {
        if (stackHead == null) {
            System.out.println("nothing here to print");
            return;
        }
        stackNode temp = stackHead;

        while (temp != null) {
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void printQueueData() {
        if (QueueTail == null) {
            System.out.println("nothing to print");
            return;
        }

        queueNode temp=queueHead;

        while (temp!=null) {
            System.out.print(temp.data+" --> ");
            temp=temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        stackAndQueueUsingLL sql = new stackAndQueueUsingLL();

        // sql.pushDataIntoStack(10);
        // sql.pushDataIntoStack(20);
        // sql.pushDataIntoStack(30);
        // sql.pushDataIntoStack(40);
        // sql.pushDataIntoStack(50);

        // sql.printStackData();
        // System.out.println("stackhaed: " + sql.stackHead.data);
        // System.out.println("stacktail: " + sql.stackTail.data);
        // System.out.println("stacksize: "+sql.stackSize);

        // sql.popDataFromStack();
        // sql.popDataFromStack();
        // sql.popDataFromStack();
        // System.out.println(" ");

        // sql.printStackData();
        // System.out.println("stackhaed: " + sql.stackHead.data);
        // System.out.println("stacktail: " + sql.stackTail.data);
        // System.out.println("stacksize: "+sql.stackSize);

        // sql.popDataFromStack();
        // sql.popDataFromStack();

        // sql.printStackData();
        // System.out.println("stacksize: "+sql.stackSize);


        sql.insertDataIntoQueue(10);
        sql.insertDataIntoQueue(20);
        sql.insertDataIntoQueue(30);
        sql.insertDataIntoQueue(40);
        sql.insertDataIntoQueue(50);

        sql.printQueueData();
        System.out.println("queuehead: "+sql.queueHead.data);
        System.out.println("quetail: "+sql.QueueTail.data);
        System.out.println("quesize: "+sql.QueueSize);

        sql.removeDataFromQueue();
        sql.removeDataFromQueue();

        sql.printQueueData();
        System.out.println("queuehead: "+sql.queueHead.data);
        System.out.println("quetail: "+sql.QueueTail.data);
        System.out.println("quesize: "+sql.QueueSize);

        sql.removeDataFromQueue();
        sql.removeDataFromQueue();
        sql.removeDataFromQueue();
        
        sql.printQueueData();
        System.out.println("quesize: "+sql.QueueSize);

    }
}