import java.util.Scanner;

public class Stack {

    int top;
    int stack[];
    int capacity;

    public Stack(int capacity){
        this.top=-1;
        this.capacity=capacity;
        this.stack=new int[capacity];
    }

    public void push(int item){
        if(top==capacity-1){
            System.out.println("stack overflow");
            return;
        }
        System.out.println(item+" inserted successfully");
        stack[++top]=item;
    }

    public void pop(){
        if(top==-1){
            System.out.println("stack underflow");
            return;
        }
        System.out.println(stack[top]+" deleted successfully");
        top--;
    }

    public void display(){
        if(top==-1){
            System.out.println("stack is empty");
            return;
        }
        System.out.print("[");

        for(int i=top;i>=0;i--){
            if(i==0){
                System.out.println(stack[i]+"]");
                break;
            }
            System.out.print(stack[i]+",");
        }
    }

    public boolean isFull(){
        return top==capacity-1;
    }

    public boolean isEmpty(){
        return top==-1;
    }

    public int getSIze(){
        return top+1;
    }


    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        Stack stack=new Stack(5);

        int opt;

        while (true) {
            System.out.println("enter 1 --> insert 2 --> delete 3 --> display 4 --> isEmpty 5 --> isFull 6 --> getSize: ");
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
                System.out.println("is stack full: "+stack.isFull());
            }else if(opt==6){
                System.out.println("current size of the stack is: "+stack.getSIze());
            }else{
                break;
            }
        }

        scanner.close();

    }
    
}