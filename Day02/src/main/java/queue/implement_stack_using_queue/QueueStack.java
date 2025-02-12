package queue.implement_stack_using_queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueStack {
    private Queue<Integer> queue = new LinkedList<>();

    public void push(int value) {
        int size = queue.size();
        queue.offer(value);

        for (int i = 0; i < size; i++) {
            queue.offer(queue.poll());
        }
    }

    public int pop() {
        if (queue.isEmpty()) throw new RuntimeException("Stack is empty");
        return queue.poll();
    }

    public int top() {
        if (queue.isEmpty()) throw new RuntimeException("Stack is empty");
        return queue.peek();
    }

    public static void main(String[] args) {
        QueueStack stack = new QueueStack();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Top: " + stack.top());
        System.out.println("Pop: " + stack.pop());
        System.out.println("Remaining Top: " + stack.top());
    }
}
