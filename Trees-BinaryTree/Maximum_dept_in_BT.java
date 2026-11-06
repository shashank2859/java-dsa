
public class Maximum_dept_in_BT {

    // 1. Node class
    static class Node {
        int val;
        Node left;
        Node right;

        Node(int val) {
            this.val = val;
        }
    }

    // 2. Maximum Depth method
    public static int maxDepth(Node root) {
        if(root == null){
            return 0;
        }
        int lh=maxDepth(root.left);
        int rh=maxDepth(root.right);

        return 1 + Math.max(lh,rh);
    }

    // 3. Main method
    public static void main(String[] args) {

        Node root = new Node(10);

        root.left = new Node(20);
        root.right = new Node(30);

        root.left.left = new Node(40);
        root.left.left.left = new Node(50);

        System.out.println("Maximum Depth: " + maxDepth(root));
    }
}
