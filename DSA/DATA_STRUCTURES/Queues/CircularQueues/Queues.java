import java.util.Scanner;

public class Queues {

    int rear;
    int front;
    int Queue[];
    int count;
    int capacity;

    public Queues(int capacity){
        this.rear=-1;
        this.front=0;
        this.count=0;
        this.capacity=capacity;
        this.Queue=new int[capacity];
    }

    public void enqueue(int data){
        if(count==capacity){
            System.out.println("Queue overflow");
            return;
        }
        count++;
        rear=(rear+1)%capacity;
        Queue[rear]=data;
    }

    public int dequeue(){
        if(count==0){
            System.out.println("Queue Underflow");
            return -1;
        }

        count--;
        int val=Queue[front];
        front=(front+1)%capacity;
        return val;
    }

    public void display(){
        if(count==0){
            System.out.println("Nothing to display");
            return;
        }
        int idx=front;

        System.out.print("[");
        for(int i=0;i<count;i++){
            if(i==count-1){
                System.out.println(Queue[idx]+"]");
                break;
            }
            System.out.print(Queue[idx]+",");
            idx=(idx+1)%capacity;
        }

    }

    public int getSize(){
        return count;
    }

    public boolean isEmpty(){
        return count==0;
    }

    public boolean isFull(){
        return count==capacity;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Queues queues = new Queues(5);

        int opt;

        while (true) {
            System.out.println("enter 1 --> insert, 2 --> delete, 3 --> display, 4 --> isEmpty, 5 --> isFull, 6 --> getSize: ");
            opt = scanner.nextInt();

            if (opt == 1) {
                System.out.println("enter value to insert: ");
                int val = scanner.nextInt();
                queues.enqueue(val);
            } else if (opt == 2) {
                System.out.println("deleted value is: "+queues.dequeue());
            } else if (opt == 3) {
                queues.display();
            } else if (opt == 4) {
                System.out.println("is queue empty: " + queues.isEmpty());
            } else if(opt==5){
                System.out.println("is queue full: "+queues.isFull());
            }else if (opt == 6) {
                System.out.println("current size of the queue is: " + queues.getSize());
            } else {
                break;
            }
        }

        scanner.close();

    }
}