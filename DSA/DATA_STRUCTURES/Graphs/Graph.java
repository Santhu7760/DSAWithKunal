import java.util.ArrayList;

public class Graph {

    int size;
    ArrayList<Node> graph[];

    public Graph(int size){
        this.size=size;
        graph=new ArrayList[size];
    }

    public class Node {
        int src;
        int dest;

        public Node(int src,int dest){
            this.src=src;
            this.dest=dest;
        }
    }

    public void insert(){
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<>();
        }

        graph[0].add(new Node(0, 1));

        graph[1].add(new Node(1, 0));
        graph[1].add(new Node(1, 2));
        graph[1].add(new Node(1, 3));

        graph[2].add(new Node(2, 1));
        graph[2].add(new Node(2, 3));

        graph[3].add(new Node(3, 1));
        graph[3].add(new Node(3, 2));

    }

    public void getDestinations(int src){
        for(int i=0;i<graph[src].size();i++){
            System.out.print(graph[src].get(i).dest+" ");
        }
    }

    public static void main(String[] args) {
        Graph graph=new Graph(4);

        graph.insert();
        graph.getDestinations(1);
    }
}