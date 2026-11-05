
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class iterative_preorder {
    static class Node {
        int val;
        Node left;
        Node right;

        Node(int val) {
            this.val = val;
        }
    }
    static List<Integer> preorderTraversal (Node root) {
        List<Integer> preorder=new ArrayList<>();
        if(root == null){
            return preorder;
        }
        Stack<Node> st = new Stack<>();
        st.push(root);
        while(!st.isEmpty()){
            root=st.pop();
            preorder.add(root.val);
            if(root.right!=null){
                st.push(root.right);
            }
            if(root.left!=null){
                st.push(root.left);
            }
            

        }
        return preorder;
    }

     public static void main(String[] args) {

        Node root = new Node(10);

        root.left = new Node(20);
        root.right = new Node(30);

        root.left.left = new Node(40);
        root.left.right = new Node(50);

        System.out.print(preorderTraversal(root));
    }
}


