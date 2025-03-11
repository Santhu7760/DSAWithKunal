package BFS;

import BinarySearchTree.Tree;
import java.util.*;
import BinarySearchTree.Tree.Node;

public class LeetCode102 {
    public static void main(String[] args) {
        Tree tree=new Tree();     
        int arr[]={30,20,10,25,50,40,60};
    
        tree.populate(arr);
        tree.display();

        List<List<Integer>> list=new ArrayList<>();

        list=levelOrder(tree.root);

        System.out.println(list);
    }

    public static List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> list=new ArrayList<>();

        if(root==null){
            return list;
        }

        Queue<Node> queue=new LinkedList<>();

        queue.offer(root);

        while(queue.size()!=0){
            int len=queue.size();
            List<Integer> list2=new ArrayList<>(len);

            for(int i=0;i<len;i++){
                Node temp=queue.poll();
                list2.add(temp.data);

                if(temp.left!=null) queue.offer(temp.left);
                if(temp.right!=null) queue.offer(temp.right);
            }
            list.add(list2);
        }
        return list;
    }
}
