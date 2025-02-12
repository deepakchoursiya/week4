package set_test.subset_test;

import org.junit.jupiter.api.Test;
import set.subset.SubSetChecker;

import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

class SubsetCheckerTest {
    @Test
    void testIsSubset() {
        Set<Integer> subset = new HashSet<>(Arrays.asList(2, 3));
        Set<Integer> mainSet = new HashSet<>(Arrays.asList(1, 2, 3, 4));
        assertTrue(SubSetChecker.isSubset(subset, mainSet));
    }

    @Test
    void testIsNotSubset() {
        Set<Integer> subset = new HashSet<>(Arrays.asList(5, 6));
        Set<Integer> mainSet = new HashSet<>(Arrays.asList(1, 2, 3, 4));
        assertFalse(SubSetChecker.isSubset(subset, mainSet));
    }
}
