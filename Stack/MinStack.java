package Stack;

import java.util.Stack;

public class MinStack {
Stack<Integer> stack = new Stack<>();
Stack<Integer> minStack = new Stack<>();

    public void push(int val) {

        stack.push(val);

        if (minStack.isEmpty() || val <= minStack.peek()) {
            minStack.push(val);
        } else {
            minStack.push(minStack.peek());
        }
    }

    public void pop() {
        stack.pop();
        minStack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }
public static void main(String[] args) {
    MinStack m =new MinStack();
    m.push(5);
    m.push(2);
    m.push(7);
    m.push(8);
    m.push(1);
    System.out.println("min value = "+m.getMin());
    m.pop();
    System.out.println("second min value = "+m.getMin());


}
} 

