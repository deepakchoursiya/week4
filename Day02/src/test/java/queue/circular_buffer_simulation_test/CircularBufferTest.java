package queue.circular_buffer_simulation_test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import queue.circular_buffer_simulation.CircularBuffer;

import java.util.Queue;
import java.util.LinkedList;

class CircularBufferTest {
    @Test
    void testCircularBuffer() {
        CircularBuffer buffer = new CircularBuffer(3);
        buffer.insert(1);
        buffer.insert(2);
        buffer.insert(3);

        Queue<Integer> expected = new LinkedList<>();
        expected.offer(1);
        expected.offer(2);
        expected.offer(3);
        assertEquals(expected, buffer.getBufferContents());

        buffer.insert(4);
        Queue<Integer> expectedAfterInsert = new LinkedList<>();
        expectedAfterInsert.offer(2);
        expectedAfterInsert.offer(3);
        expectedAfterInsert.offer(4);
        assertEquals(expectedAfterInsert, buffer.getBufferContents());
    }
}
