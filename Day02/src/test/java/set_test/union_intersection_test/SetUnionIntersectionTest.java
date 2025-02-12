package set_test.union_intersection_test;

import org.junit.jupiter.api.Test;
import set.union_intersection.SetUnionIntersection;

import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

class SetUnionIntersectionTest {
    @Test
    void testUnion() {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(3, 4, 5));
        Set<Integer> expectedUnion = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
        assertEquals(expectedUnion, SetUnionIntersection.getUnion(set1, set2));
    }

    @Test
    void testIntersection() {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(3, 4, 5));
        Set<Integer> expectedIntersection = new HashSet<>(Arrays.asList(3));
        assertEquals(expectedIntersection, SetUnionIntersection.getIntersection(set1, set2));
    }
}

