public class CustomArrays {

        public int index=-1;

        public int size;
        public int[] arr;

        public CustomArrays(int size){
            this.size=size;
            this.arr=new int[size];
        }

        public void insert(int data){
            if(index==size-1){
                System.out.println("Array overflow");
                return;
            }
            arr[++index]=data;
        }

        public void delete(){
            if(index==-1){
                System.out.println("Array underflow");
                return;
            }
            index--;
        }

        public void display(){
            if(index==-1){
                System.out.println("nothing to display");
                return;
            }
            System.out.print("[");

            for(int i=0;i<=index;i++){
                if(i==index){
                    System.out.print(arr[i]);
                    break;
                }

                System.out.print(arr[i]+",");
            }
            System.out.println("]");
        }

        public void searchData(int data){
            if(index==-1){
                System.out.println("nothing to search");
                return;
            }
            for(int i=0;i<=index;i++){
                if(arr[i]==data){
                    System.out.print("found");
                    return;
                }
            }
            System.out.println("not found");
        }

        public void reverse(){
            if(index==-1){
                System.out.println("nothing to search");
                return;
            }

            for(int i=0,j=index;i<=index/2;i++,j--){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }

        public int getLength(){
            return index+1;
        }

    public static void main(String[] args) {
        CustomArrays ca=new CustomArrays(10);

        ca.insert(10);
        ca.insert(20);
        ca.insert(30);
        ca.insert(40);
        ca.display();
        ca.delete();
        ca.display();
        ca.delete();
        ca.display();
        ca.searchData(50);
        ca.reverse();
        ca.display();
        ca.reverse();
        ca.insert(30);
        ca.insert(40);
        ca.insert(50);
        ca.reverse();
        ca.display();

    }
}