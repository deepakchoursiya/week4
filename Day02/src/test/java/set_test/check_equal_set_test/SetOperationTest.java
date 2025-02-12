package set_test.check_equal_set_test;

import org.junit.jupiter.api.Test;
import set.check_equal_set.SetOperation;

import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

class SetOperationsTest {
    @Test
    void testAreSetsEqual() {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(3, 2, 1));
        assertTrue(SetOperation.areSetsEqual(set1, set2));
    }

    @Test
    void testAreSetsNotEqual() {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(4, 5, 6));
        assertFalse(SetOperation.areSetsEqual(set1, set2));
    }
}
