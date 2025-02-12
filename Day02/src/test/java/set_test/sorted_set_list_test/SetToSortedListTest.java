package set_test.sorted_set_list_test;

import org.junit.jupiter.api.Test;
import set.sorted_set_list.SetToSortedList;

import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

class SetToSortedListTest {
    @Test
    void testConvertToSortedList() {
        Set<Integer> inputSet = new HashSet<>(Arrays.asList(5, 3, 9, 1));
        List<Integer> expectedList = Arrays.asList(1, 3, 5, 9);
        assertEquals(expectedList, SetToSortedList.convertToSortedList(inputSet));
    }
}
