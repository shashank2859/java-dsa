import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class iterative_inorder {
    static class Node {
        int val;
        Node left;
        Node right;

        Node(int val) {
            this.val = val;
        }
    }
    static List<Integer> inorderTraversal (Node root) {
        List<Integer> inorder=new ArrayList<>();
        Stack<Node> st = new Stack<>();
        while (true) { 
            if (root!=null){
                st.push(root);
                root=root.left;
             }
             else{
                if(st.isEmpty()) break;
                root=st.pop();
                inorder.add(root.val);
                root=root.right;
             } 
        }
        return inorder;
    }

     public static void main(String[] args) {

        Node root = new Node(10);

        root.left = new Node(20);
        root.right = new Node(30);

        root.left.left = new Node(40);
        root.left.right = new Node(50);

        System.out.print(inorderTraversal(root));
    }
}
