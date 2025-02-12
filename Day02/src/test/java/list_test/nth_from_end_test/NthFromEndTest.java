package list_test.nth_from_end_test;

import list.nth_element_from_end.NthFromEnd;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.LinkedList;
import static org.junit.jupiter.api.Assertions.*;

class NthFromEndTest {
    @Test
    void testFindNthFromEnd() {
        LinkedList<String> input = new LinkedList<>(Arrays.asList("A", "B", "C", "D", "E"));
        assertEquals("D", NthFromEnd.findNthFromEnd(input, 2));
    }

    @Test
    void testFindNthFromEndWithNEqualToSize() {
        LinkedList<String> input = new LinkedList<>(Arrays.asList("A", "B", "C", "D", "E"));
        assertEquals("A", NthFromEnd.findNthFromEnd(input, 5));
    }

    @Test
    void testFindNthFromEndWithNGreaterThanSize() {
        LinkedList<String> input = new LinkedList<>(Arrays.asList("A", "B", "C"));
        assertNull(NthFromEnd.findNthFromEnd(input, 4));
    }
}

