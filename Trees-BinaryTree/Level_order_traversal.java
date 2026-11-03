import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class Level_order_traversal {

    
    // 1. Node class
    static class Node {
        int val;
        Node left;
        Node right;

        Node(int val) {
            this.val = val;
            
    }
}
    public static List<List<Integer>> LevelOrder(Node root){

        Queue<Node> queue = new ArrayDeque<>();
        List<List<Integer>> wraplist= new ArrayList<>();

        if(root==null){
            return wraplist;
        }
        queue.offer(root);

        while(!queue.isEmpty()){
            int levelnum=queue.size();
            List<Integer> sublist= new ArrayList<>(); 
            
            for ( int i = 0; i<levelnum;i++) {
                Node current= queue.poll();
                sublist.add(current.val);

                if(current.left!=null){
                    queue.offer(current.left);
                }
                if(current.right!=null){
                    queue.offer(current.right);
                }
            }
                wraplist.add(sublist);
        }
        return wraplist;
    }

    // 2. Main method
    public static void main(String[] args) {

        Node root = new Node(10);

        root.left = new Node(20);
        root.right = new Node(30);

        root.left.left = new Node(40);
        root.left.right = new Node(50);

        System.out.println(LevelOrder( root));
    }
}


