package queue.implement_stack_using_queue;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class QueueStackTest {
    @Test
    void testStackOperations() {
        QueueStack stack = new QueueStack();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        assertEquals(3, stack.pop());
        assertEquals(2, stack.top());
        assertEquals(2, stack.pop());
        assertEquals(1, stack.pop());
    }
}
