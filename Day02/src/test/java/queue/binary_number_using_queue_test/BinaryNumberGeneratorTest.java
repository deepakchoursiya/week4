package queue.binary_number_using_queue_test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import queue.generate_binary_number_using_queue.BinaryNumberGenerator;

import java.util.Queue;
import java.util.LinkedList;

class BinaryNumberGeneratorTest {
    @Test
    void testGenerateBinaryNumbers() {
        Queue<String> expected = new LinkedList<>();
        expected.offer("1");
        expected.offer("10");
        expected.offer("11");
        expected.offer("100");
        expected.offer("101");

        assertEquals(expected, BinaryNumberGenerator.generateBinaryNumbers(5));
    }
}
