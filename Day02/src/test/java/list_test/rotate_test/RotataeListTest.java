package list_test.rotate_test;

import list.rotate.RotateList;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class RotateListTest {
    @Test
    void testRotateList() {
        List<Integer> input = Arrays.asList(10, 20, 30, 40, 50);
        List<Integer> expected = Arrays.asList(30, 40, 50, 10, 20);
        assertEquals(expected, RotateList.rotate(input, 2));
    }

    @Test
    void testRotateListByZero() {
        List<Integer> input = Arrays.asList(10, 20, 30);
        assertEquals(input, RotateList.rotate(input, 0));
    }

    @Test
    void testRotateListBySize() {
        List<Integer> input = Arrays.asList(10, 20, 30, 40, 50);
        assertEquals(input, RotateList.rotate(input, 5));
    }
}
