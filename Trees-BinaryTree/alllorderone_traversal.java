
import java.util.*;

public class alllorderone_traversal {
    static class Node {
        int val;
        Node left;
        Node right;

        Node(int val) {
            this.val = val;
        }
    }

    static class pair {
        Node node;
        int state;

        pair(Node node, int state) {
            this.node = node;
            this.state = state;
        }
    }

    // 3. Traversal method
    public static void allTraversals(Node root) {

        // Create three result lists
        List<Integer> preorder = new ArrayList<>();
        List<Integer> inorder = new ArrayList<>();
        List<Integer> postorder = new ArrayList<>();
            if( root == null){
                return;
            }
        Stack<pair> stack = new Stack<>();
        stack.push(new pair(root,1));

            while(!stack.isEmpty()){
                pair it=stack.pop();

                if(it.state==1){
                    preorder.add(it.node.val);
                    it.state++;
                    stack.push(it);

                    if(it.node.left!=null){
                        stack.push(new pair(it.node.left,1));
                    }
                }
                else if(it.state==2){
                    inorder.add(it.node.val);
                    it.state++;
                    stack.push(it);

                    if(it.node.right!=null){
                        stack.push(new pair(it.node.right,1));
                    }
                }
                else{
                    postorder.add(it.node.val);
                }

            }


        // Process stack using while loop


        System.out.println("Preorder: " + preorder);
        System.out.println("Inorder: " + inorder);
        System.out.println("Postorder: " + postorder);

    }

    // 4. Main method
    public static void main(String[] args) {

        Node root = new Node(1);

        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(4);
        root.left.right = new Node(5);

        allTraversals(root);
    }
}
