package queue.generate_binary_number_using_queue;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryNumberGenerator {
    public static Queue<String> generateBinaryNumbers(int n) {
        Queue<String> resultQueue = new LinkedList<>();
        Queue<String> queue = new LinkedList<>();
        queue.offer("1");

        for (int i = 0; i < n; i++) {
            String front = queue.poll();
            resultQueue.offer(front);
            queue.offer(front + "0");
            queue.offer(front + "1");
        }
        return resultQueue;
    }

    public static void main(String[] args) {
        int n = 5;
        Queue<String> result = generateBinaryNumbers(n);
        System.out.println("Binary Numbers: " + result);
    }
}

