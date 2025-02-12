package list_test.reverse_list_test;

import list.reverse_list.ReverseList;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class ReverseListTest {
    @Test
    void testReverseList() {
        List<Integer> input = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> expected = Arrays.asList(5, 4, 3, 2, 1);
        assertEquals(expected, ReverseList.reverseList(input));
    }

    @Test
    void testReverseEmptyList() {
        List<Integer> input = Arrays.asList();
        List<Integer> expected = Arrays.asList();
        assertEquals(expected, ReverseList.reverseList(input));
    }
}
