import java.util.Scanner;

public class linkedList {

    Node Head=null;

    public class Node{

        int val;
        char ch;
        String str;

        Node next;

        Node(int val){
            this.val=val;
            this.ch='\u0000';
            this.str=null;
            this.next=null;
        }

        Node(char ch){
            this.ch=ch;
            this.val=0;
            this.str=null;
            this.next=null;
        }

        Node(String str){
            this.str=str;
            this.val=0;
            this.ch='\u0000';
            this.next=null;
        }

    }

    public void insertAtBeginning(int val){
        Node node=new Node(val);

        node.next=Head;
        Head=node;

    }

    public void insertAtBeginning(char ch){
        Node node=new Node(ch);

        node.next=Head;
        Head=node;

    }

    public void insertAtBeginning(String str){
        Node node=new Node(str);

        node.next=Head;
        Head=node;

    }

    public void insertAtEnd(int val){
        Node node=new Node(val);

        if(Head==null){
            node.next=Head;
            Head=node;
            return;
        }

        Node tempNode=Head;

        while (tempNode.next!=null) {
            tempNode=tempNode.next;
        }
        tempNode.next=node;
    }

    public void insertAtEnd(char ch){
        Node node=new Node(ch);

        if(Head==null){
            node.next=Head;
            Head=node;
            return;
        }

        Node tempNode=Head;

        while (tempNode.next!=null) {
            tempNode=tempNode.next;
        }
        tempNode.next=node;
    }

    public void insertAtEnd(String str){
        Node node=new Node(str);

        if(Head==null){
            node.next=Head;
            Head=node;
            return;
        }

        Node tempNode=Head;

        while (tempNode.next!=null) {
            tempNode=tempNode.next;
        }
        tempNode.next=node;
    }

    public void insertAtParticularLocation(int val,int loc){
        if(Head==null){
            System.out.println("Sorry Location Not Found!");
            return;
        }

        Node node=new Node(val);

        Node tempNode=Head;

        while (tempNode!=null && tempNode.val!=loc) {
            tempNode=tempNode.next;
        }

        if(tempNode==null){
            System.out.println("Sorry Location Not Found!");
            return;
        }

        node.next=tempNode.next;
        tempNode.next=node;
    }

    public void insertAtParticularLocation(char ch,char loc){
        if(Head==null){
            System.out.println("Sorry Location Not Found!");
            return;
        }

        Node node=new Node(ch);

        Node tempNode=Head;

        while (tempNode!=null && tempNode.ch!=loc) {
            tempNode=tempNode.next;
        }

        if(tempNode==null){
            System.out.println("Sorry Location Not Found!");
            return;
        }

        node.next=tempNode.next;
        tempNode.next=node;
    }

    public void insertAtParticularLocation(String str,String loc){
        if(Head==null){
            System.out.println("Sorry Location Not Found!");
            return;
        }

        Node node=new Node(str);

        Node tempNode=Head;

        while (tempNode!=null && tempNode.str!=loc) {
            tempNode=tempNode.next;
        }

        if(tempNode==null){
            System.out.println("Sorry Location Not Found!");
            return;
        }

        node.next=tempNode.next;
        tempNode.next=node;
    }

    public void deleteAtBeginning(){
        if(Head==null){
            System.out.println("Nothing To Delete!");
            return;
        }
        Head=Head.next;
    }

    public void deleteAtEnd(){
        if(Head==null){
            System.out.println("Nothing To Delete!");
            return;
        }

        Node tempNode=Head;
        Node tempNode2=null;

        while (tempNode.next!=null) {
            tempNode2=tempNode;
            tempNode=tempNode.next;
        }
        tempNode2.next=null;
    }

    public void deleteAtParticularLocation(int loc){
        if(Head==null){
            System.out.println("Nothing To Delete!");
            return;
        }

        Node tempNode=Head;
        Node tempNode2=null;

        while (tempNode!=null && tempNode.val!=loc) {
            tempNode2=tempNode;
            tempNode=tempNode.next;
        }

        if(tempNode==null){
            System.out.println("Sorry Location Not Found!");
            return;
        }

        tempNode2.next=tempNode.next;
    }

    public void deleteAtParticularLocation(char loc){
        if(Head==null){
            System.out.println("Nothing To Delete!");
            return;
        }

        Node tempNode=Head;
        Node tempNode2=null;

        while (tempNode!=null && tempNode.ch!=loc) {
            tempNode2=tempNode;
            tempNode=tempNode.next;
        }

        if(tempNode==null){
            System.out.println("Sorry Location Not Found!");
            return;
        }

        tempNode2.next=tempNode.next;
    }

    public void deleteAtParticularLocation(String loc){
        if(Head==null){
            System.out.println("Nothing To Delete!");
            return;
        }

        Node tempNode=Head;
        Node tempNode2=null;

        while (tempNode!=null && tempNode.str!=loc) {
            tempNode2=tempNode;
            tempNode=tempNode.next;
        }

        if(tempNode==null){
            System.out.println("Sorry Location Not Found!");
            return;
        }

        tempNode2.next=tempNode.next;
    }

    public void printNodes() {
        if (Head == null) {
            System.out.println("Nothing To Print!");
            return;
        }
    
        Node tempNode = Head;
    
        while (tempNode != null) {
            if (tempNode.val != 0) {
                System.out.print(tempNode.val + " --> ");
            }
            else if (tempNode.ch != '\u0000') {
                System.out.print(tempNode.ch + " --> ");
            }
            else if (tempNode.str != null) {
                System.out.print(tempNode.str + " --> ");
            }
            tempNode = tempNode.next;
        }
        System.out.println("NULL");
    }
    

    public void searchNodeValue(int target){
        if(Head==null){
            System.out.println("Nothing To Search!");
            return;
        }
        Node tempNode=Head;

        while (tempNode!=null && tempNode.val!=target) {
            tempNode=tempNode.next;
        }
        if(tempNode==null){
            System.out.println("Not Found");
            return;
        }
        System.out.println("Found");
    }

    public void searchNodeValue(char target){
        if(Head==null){
            System.out.println("Nothing To Search!");
            return;
        }
        Node tempNode=Head;

        while (tempNode!=null && tempNode.ch!=target) {
            tempNode=tempNode.next;
        }
        if(tempNode==null){
            System.out.println("Not Found");
            return;
        }
        System.out.println("Found");
    }

    public void searchNodeValue(String target){
        if(Head==null){
            System.out.println("Nothing To Search!");
            return;
        }
        Node tempNode=Head;

        while (tempNode!=null && tempNode.str!=target) {
            tempNode=tempNode.next;
        }
        if(tempNode==null){
            System.out.println("Not Found");
            return;
        }
        System.out.println("Found");
    }

    public void updateNodeValue(int oldValue,int newValue){
        if(Head==null){
            System.out.println("Nothing To Search!");
            return;
        }
        Node temNode=Head;

        while (temNode!=null && temNode.val!=oldValue) {
            temNode=temNode.next;
        }
        if(temNode==null){
            System.out.println("Value Not Found!");
            return;
        }
        temNode.val=newValue;
    }

    public void updateNodeValue(char oldValue,char newValue){
        if(Head==null){
            System.out.println("Nothing To Search!");
            return;
        }
        Node temNode=Head;

        while (temNode!=null && temNode.ch!=oldValue) {
            temNode=temNode.next;
        }
        if(temNode==null){
            System.out.println("Value Not Found!");
            return;
        }
        temNode.ch=newValue;
    }

    public void updateNodeValue(String oldValue,String newValue){
        if(Head==null){
            System.out.println("Nothing To Search!");
            return;
        }
        Node temNode=Head;

        while (temNode!=null && temNode.str!=oldValue) {
            temNode=temNode.next;
        }
        if(temNode==null){
            System.out.println("Value Not Found!");
            return;
        }
        temNode.str=newValue;
    }

    public int getSize(){
        if(Head==null){
            return 0;
        }
        Node temNode=Head;
        int size=0;

        while (temNode!=null) {
            temNode=temNode.next;
            size++;
        }
        return size;
    }

    public void reverseList(){
        if(Head==null){
            System.out.println("Nothing To Reverse!");
            return;
        }

        if(Head.next==null){
            return;
        }

        Node currNode=Head;
        Node nextNode=null;
        Node prevNode=null;

        while (currNode!=null) {
            nextNode=currNode.next;
            currNode.next=prevNode;
            prevNode=currNode;
            currNode=nextNode;
        }
        Head=prevNode;
    }

    public void checkIsEmpty(){
        if(Head==null){
            System.out.println("Yes, The List Is Empty");
            return;
        }
        System.out.println("No, The List Is Not Empty");
    }

    public void clearList(){
        Head=null;
    }

    public static void main(String[] args) {
        linkedList list=new linkedList();
        Scanner scanner=new Scanner(System.in);
        int option=-1;

        do{
            System.out.println("\n1 -> Insert \n 2 -> Delete \n 3 -> Print Nodes \n 4 -> Search Nodes \n 5 -> Update Node Value \n 6 -> Get Size Of The List \n 7 -> Reverse List \n 8 -> Check Is List Empty \n 9 -> Remove All Nodes");
            System.out.print("enter your option: ");
            option=scanner.nextInt();

            if(option==1){
                System.out.println("\n1 -> Insert At Beginning \n 2 -> Insert At End \n 3 -> Insert At Particular Location");
                System.out.print("Enter your choice: ");
                int choice=scanner.nextInt();

                if(choice==1){
                    System.out.println("\n1 -> Insert Integer \n 2-> Insert Character \n 3 -> Insert String ");
                    System.out.print("Enter your option: ");

                    int opt=scanner.nextInt();

                    if(opt==1){
                        System.out.print("\nEnter the Integer value to insert: ");
                        int val=scanner.nextInt();
                        scanner.nextLine();
                        list.insertAtBeginning(val);
                    }else if(opt==2){
                        System.out.print("\nEnter the Character value to insert: ");
                        char ch=scanner.next().charAt(0);
                        scanner.nextLine();
                        list.insertAtBeginning(ch);
                    }else if(opt==3){
                        System.out.print("\nEnter the String value to insert: ");
                        scanner.nextLine();
                        String str=scanner.nextLine();
                        list.insertAtBeginning(str);
                    }else{
                        break;
                    }
                }else if(choice==2){
                    System.out.println("\n1 -> Insert Integer \n 2-> Insert Character \n 3 -> Insert String ");
                    System.out.print("Enter your option: ");

                    int opt=scanner.nextInt();

                    if(opt==1){
                        System.out.print("\nEnter the Integer value to insert: ");
                        int val=scanner.nextInt();
                        scanner.nextLine();
                        list.insertAtEnd(val);
                    }else if(opt==2){
                        System.out.print("\nEnter the Character value to insert: ");
                        char ch=scanner.next().charAt(0);
                        scanner.nextLine();
                        list.insertAtEnd(ch);
                    }else if(opt==3){
                        System.out.print("\nEnter the String value to insert: ");
                        scanner.nextLine();
                        String str=scanner.nextLine();
                        list.insertAtEnd(str);
                    }else{
                        break;
                    }
                }else if(choice==3){
                    System.out.println("\n1 -> Insert Integer \n 2-> Insert Character \n 3 -> Insert String ");
                    System.out.print("Enter your option: ");

                    int opt=scanner.nextInt();

                    if(opt==1){
                        System.out.print("\nEnter the Integer value to insert: ");
                        int val=scanner.nextInt();
                        System.out.println("\nEnter the location: ");
                        int loc=scanner.nextInt();
                        scanner.nextLine();
                        list.insertAtParticularLocation(val,loc);
                    }else if(opt==2){
                        System.out.print("\nEnter the Character value to insert: ");
                        char ch=scanner.next().charAt(0);
                        scanner.nextLine();
                        System.out.println("\nEnter the location: ");
                        char loc=scanner.next().charAt(0);
                        scanner.nextLine();
                        list.insertAtParticularLocation(ch,loc);
                    }else if(opt==3){
                        System.out.print("\nEnter the String value to insert: ");
                        scanner.nextLine();
                        String str=scanner.nextLine();
                        System.out.println("\nEnter the location: ");
                        scanner.nextLine();
                        String loc=scanner.nextLine();
                        list.insertAtParticularLocation(str,loc);
                    }else{
                        break;
                    }
                }else{
                    break;
                }

            }else if(option==2){

                System.out.println("\n1 -> Delete From Beginning \n 2 -> Delete From End \n 3 -> Delete From Particular Location");
                System.out.print("Enter your choice: ");
                int choice=scanner.nextInt();
                scanner.nextLine();

                if(choice==1){
                    list.deleteAtBeginning();
                }else if(choice==2){
                    list.deleteAtEnd();
                }else if(choice==3){
                    System.out.println("\n Enter 1 -> Delete After Integer \n 2 -> Delete After Character \n 3 -> Delete After String");
                    System.out.println("Enter your option: ");
                    int opt=scanner.nextInt();
                    scanner.nextLine();
                    if(opt==1){
                        System.out.print("\nEnter the Integer value to delete: ");
                        int val=scanner.nextInt();
                        scanner.nextLine();
                        list.deleteAtParticularLocation(val);
                    }else if(opt==2){
                        System.out.println("\nEnter the Character value to delete: ");
                        char ch=scanner.next().charAt(0);
                        scanner.nextLine();
                        list.deleteAtParticularLocation(ch);
                    }else if(opt==3){
                        System.out.println("\nEnter the String value to delete: ");
                        scanner.nextLine();
                        String str=scanner.nextLine();
                        list.deleteAtParticularLocation(str);
                    }else{
                        break;
                    }
                }else{
                    break;
                }

            }else if(option==3){
                list.printNodes();
            }else if(option==4){
                System.out.println("\nEnter 1 -> Search Integer \n 2 -> Search Character \n 3 -> Seearch String: ");
                int opt=scanner.nextInt();
                scanner.nextLine();

                if(opt==1){
                    System.out.print("\nEnter the Integer value to search: ");
                    int val=scanner.nextInt();
                    scanner.nextLine();
                    list.searchNodeValue(val);
                }else if(opt==2){
                    System.out.print("\nEnter the Character value to search: ");
                    char ch=scanner.next().charAt(0);
                    scanner.nextLine();
                    list.searchNodeValue(ch);
                }else if(opt==3){
                    System.out.print("\nEnter the String value to search: ");
                    scanner.nextLine();
                    String str=scanner.nextLine();
                    list.searchNodeValue(str);
                }else{
                    break;
                }
            }else if(option==5){
                System.out.println("\n1 -> Update Integer \n 2 -> Update Character \n 3 -> Update String");
                System.out.print("Enter your option: ");
                int opt=scanner.nextInt();
                scanner.nextLine();

                if(opt==1){
                    System.out.print("\nEnter the old Integer value: ");
                    int oldValue=scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("\nEnter the new Integer value: ");
                    int newValue=scanner.nextInt();
                    scanner.nextLine();
                    list.updateNodeValue(oldValue, newValue);
                }else if(opt==2){
                    System.out.print("\nEnter the old character value: ");
                    char oldValue=scanner.next().charAt(0);
                    scanner.nextLine();
                    System.out.print("\nEnter the new character value: ");
                    char newValue=scanner.next().charAt(0);
                    scanner.nextLine();
                    list.updateNodeValue(oldValue, newValue);
                }else if(opt==3){
                    System.out.print("\nEnter the old String value: ");
                    scanner.nextLine();
                    String oldValue=scanner.nextLine();
                    System.out.print("\nEnter the new String value: ");
                    scanner.nextLine();
                    String newValue=scanner.nextLine();
                    list.updateNodeValue(oldValue, newValue);
                }
            }else if(option==6){
                list.getSize();
            }else if(option==7){
                list.reverseList();
            }else if(option==8){
                list.checkIsEmpty();
            }else if(option==9){
                list.clearList();
            }else {
                break;
            }

        }while(option<10);
        scanner.close();
    }
}