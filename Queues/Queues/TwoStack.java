package Queues;
import java.util.Stack;
public class TwoStack {
    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

    public void offer(int x) {
        stack1.push(x);
    }

    public int poll() {

        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }

        return stack2.pop();
    }

    public int peek() {

        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }

        return stack2.peek();
    }

    public boolean empty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }

    public static void main(String[] args) {

        TwoStack q = new TwoStack();

        q.offer(10);
        q.offer(20);
        q.offer(30);

        System.out.println("Poll: " + q.poll());
        System.out.println("Peek: " + q.peek());

        q.offer(40);

        System.out.println("Poll: " + q.poll());
        System.out.println("Poll: " + q.poll());
        System.out.println("Poll: " + q.poll());

        System.out.println("Empty: " + q.empty());
    }
}

