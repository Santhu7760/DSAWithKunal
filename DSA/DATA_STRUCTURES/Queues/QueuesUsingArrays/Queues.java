public class Queues {

    int rear;
    int front;
    int capacity;
    int queue[];

    public Queues(int capacity){
        this.rear=-1;
        this.front=0;
        this.capacity=capacity;
        this.queue=new int[capacity];
    }

    public void enqueue(int data){
        if(rear==capacity-1){
            System.out.println("Queue Overflow");
            return;
        }
        queue[++rear]=data;
    }

    public int dequeue(){
        if(front>rear){
            System.out.println("Queue Underflow");
            return -1;
        }
        return queue[front++];
    }

    public void display(){
        if(rear==-1 || front>rear){
            System.out.println("Nothing to display");
            return;
        }
        System.out.print("[");
        for(int i=front;i<=rear;i++){
            if(i==rear){
                System.out.println(queue[i]+"]");
                break;
            }
            System.out.print(queue[i]+",");
        }
    }

    public int peek(){
        if(front>rear){
            System.out.println("Queue is empty");
            return -1;
        }
        return queue[front];
    }

    public int size(){
        return rear-front+1;
    }

    public boolean isEmpty(){
        return front>rear;
    }

    public boolean isFull(){
        return rear==capacity-1;
    }

    public static void main(String[] args) {
        Queues queues=new Queues(5);

        queues.enqueue(10);
        queues.enqueue(20);
        queues.enqueue(30);
        queues.enqueue(40);
        queues.enqueue(50);
        queues.display();
        System.out.println("Size of queue: "+queues.size());
        System.out.println("Is queue empty: "+queues.isEmpty());
        System.out.println("Is queue full: "+queues.isFull());
        System.out.println("Element at front: "+queues.peek());
        System.out.println("Element dequeued: "+queues.dequeue());
        queues.display();
        System.out.println("Size of queue: "+queues.size());
        System.out.println("Is queue empty: "+queues.isEmpty());
        System.out.println("Is queue full: "+queues.isFull());
        System.out.println("Element at front: "+queues.peek());

    }
}
