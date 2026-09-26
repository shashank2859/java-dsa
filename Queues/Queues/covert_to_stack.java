package Queues;

import java.util.ArrayDeque;
import java.util.Queue;

public class covert_to_stack {
    Queue<Integer> q = new ArrayDeque<>();
    public void push(int x) {
    int n =q.size();
    q.offer(x);

    for(int i =0;i<n;i++){
        q.offer(q.poll());
    }       
}
public int pop(){
    return q.poll();

}
public int top(){
    return q.peek();  
}
public boolean empty(){
    return q.isEmpty();
}
public static void main(String[] args) {

        covert_to_stack stack = new covert_to_stack();


        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Top: " + stack.top());

        System.out.println("Pop: " + stack.pop());

        System.out.println("Top after pop: " + stack.top());

        System.out.println("Is empty? " + stack.empty());
    }
}