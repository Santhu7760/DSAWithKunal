public class Trie {

    public Node root=null;

    public class Node{

        Node Childrens[];
        boolean EOW;

        public Node(){
            this.Childrens=new Node[26];
        }

    }

    public Trie() {
        this.root = new Node();
    }

    public void insert(String str){

        Node temp=root;

        for(int i=0;i<str.length();i++){

            int idx=str.charAt(i)-'a'; 

            if(temp.Childrens[idx]==null){
                temp.Childrens[idx]=new Node();
            }

            temp=temp.Childrens[idx];

        }
        temp.EOW=true;

    }

    public boolean search(String str){
       
        Node temp=root;

        for(int i=0;i<str.length();i++){

            int idx=str.charAt(i)-'a'; 

            if(temp.Childrens[idx]==null){
                return false;
            }

            temp=temp.Childrens[idx];

        }
        return temp.EOW;
 
    }

    public void populate(String arr[]){

        for(int i=0;i<arr.length;i++){
            this.insert(arr[i]);
        }

    }

    public static void main(String[] args) {
        
        Trie trie=new Trie();
        String arr[]={"hello","hell","he","him","his"};

        trie.populate(arr);

        System.out.println(trie.search("hel"));

    }
}