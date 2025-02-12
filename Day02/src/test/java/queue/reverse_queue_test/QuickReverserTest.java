package queue.reverse_queue_test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import queue.reverse_queue.QueueReverser;

import java.util.LinkedList;
import java.util.Queue;

class QueueReverserTest {
    @Test
    void testReverseQueue() {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);

        Queue<Integer> reversed = QueueReverser.reverseQueue(queue);
        assertArrayEquals(new Integer[]{30, 20, 10}, reversed.toArray());
    }
}
