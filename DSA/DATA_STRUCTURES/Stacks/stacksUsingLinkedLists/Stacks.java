import java.util.Scanner;

public class Stacks {

    Node Head=null;

    public class  Node {
        
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    public void push(int data){
        Node node=new Node(data);

        System.out.println(data+" inserted successfully");

        node.next=Head;
        Head=node;

    }

    public void pop(){
        if(Head==null){
            System.out.println("stack underflow");
            return;
        }

        System.out.println(Head.data+" delted successfully");

        Head=Head.next;

    }

    public void display(){
        if(Head==null){
            System.out.println("nothing to display");
            return;
        }

        Node temp=Head;

        while (temp!=null) {
            System.out.print(temp.data+" --> ");
            temp=temp.next;
        }
        System.out.println("null");
    }

    public int getSize(){
        if(Head==null){
            System.out.println("nothing to display");
            return -1;
        }

        Node temp=Head;
        int count=0;

        while (temp!=null) {
            count++;
            temp=temp.next;
        }
        return count;
    }

    public boolean isEmpty(){
        return Head==null;
    }

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        Stacks stack=new Stacks();

        int opt;

        while (true) {
            System.out.println("enter 1 --> insert 2 --> delete 3 --> display 4 --> isEmpty 5 --> getSize: ");
            opt=scanner.nextInt();

            if(opt==1){
                System.out.println("enter value to insert: ");
                int val=scanner.nextInt();
                stack.push(val);
            }else if(opt==2){
                stack.pop();
            }else if(opt==3){
                stack.display();
            }else if(opt==4){
                System.out.println("is stack empty: "+stack.isEmpty());
            }else if(opt==5){
                System.out.println("current size of the stack is: "+stack.getSize());
            }else{
                break;
            }
        }

        scanner.close();

    }
    
}
