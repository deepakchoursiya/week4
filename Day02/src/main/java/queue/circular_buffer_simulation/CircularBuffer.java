package queue.circular_buffer_simulation;

import java.util.LinkedList;
import java.util.Queue;

public class CircularBuffer {
    private Queue<Integer> buffer;
    private int size;

    public CircularBuffer(int size) {
        this.size = size;
        buffer = new LinkedList<>();
    }

    public void insert(int value) {
        if (buffer.size() == size) {
            buffer.poll(); // Remove the oldest element
        }
        buffer.offer(value);
    }

    public Queue<Integer> getBufferContents() {
        return new LinkedList<>(buffer);
    }

    public static void main(String[] args) {
        CircularBuffer buffer = new CircularBuffer(3);
        buffer.insert(1);
        buffer.insert(2);
        buffer.insert(3);
        System.out.println("Buffer: " + buffer.getBufferContents());

        buffer.insert(4);
        System.out.println("After inserting 4: " + buffer.getBufferContents());
    }
}
