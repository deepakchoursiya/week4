package map.invert_a_map_test;

import static org.junit.jupiter.api.Assertions.*;

import map.invert_a_map.MapInverter;
import org.junit.jupiter.api.Test;
import java.util.*;

class MapInverterTest {
    @Test
    void testInvertMap() {
        Map<String, Integer> input = new HashMap<>();
        input.put("A", 1);
        input.put("B", 2);
        input.put("C", 1);

        Map<Integer, List<String>> result = MapInverter.invertMap(input);
        assertTrue(result.get(1).containsAll(Arrays.asList("A", "C")));
        assertEquals(Collections.singletonList("B"), result.get(2));
    }
}
