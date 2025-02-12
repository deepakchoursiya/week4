package map.key_with_highest_value_test;

import static org.junit.jupiter.api.Assertions.*;

import map.key_with_highest_value.MaxValueKeyFinder;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

class MaxValueKeyFinderTest {
    @Test
    void testFindMaxKey() {
        Map<String, Integer> input = new HashMap<>();
        input.put("A", 1);
        input.put("B", 2);
        input.put("C", 1);
          assertEquals("B", MaxValueKeyFinder.findMaxKey(input));
    }
}
