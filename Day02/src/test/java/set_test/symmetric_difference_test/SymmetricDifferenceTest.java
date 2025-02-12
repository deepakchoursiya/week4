package set_test.symmetric_difference_test;

import org.junit.jupiter.api.Test;
import set.symmetric_difference.SymmetricDifference;

import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

class SymmetricDifferenceTest {
    @Test
    void testSymmetricDifference() {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(3, 4, 5));
        Set<Integer> expectedDifference = new HashSet<>(Arrays.asList(1, 2, 4, 5));
        assertEquals(expectedDifference, SymmetricDifference.getSymmetricDifference(set1, set2));
    }
}
