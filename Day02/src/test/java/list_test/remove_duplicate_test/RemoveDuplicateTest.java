package list_test.remove_duplicate_test;

import list.remove_duplicate.RemoveDuplicate;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class RemoveDuplicateTest {
    @Test
    void testRemoveDuplicates() {
        List<Integer> input = Arrays.asList(3, 1, 2, 2, 3, 4);
        List<Integer> expected = Arrays.asList(3, 1, 2, 4);
        assertEquals(expected, RemoveDuplicate.removeDuplicates(input));
    }

    @Test
    void testRemoveDuplicatesFromEmptyList() {
        List<Integer> input = Arrays.asList();
        assertEquals(input, RemoveDuplicate.removeDuplicates(input));
    }
}
