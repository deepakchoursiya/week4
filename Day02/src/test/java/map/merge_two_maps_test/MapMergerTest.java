package map.merge_two_maps_test;

import static org.junit.jupiter.api.Assertions.*;

import map.merge_two_maps.MapMerger;
import org.junit.jupiter.api.Test;
import java.util.*;

class MapMergerTest {
    @Test
    void testMergeMaps() {
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("A", 1);
        map1.put("B", 2);

        Map<String, Integer> map2 = new HashMap<>();
        map2.put("B", 3);
        map2.put("C", 4);


        Map<String, Integer> result = MapMerger.mergeMaps(map1, map2);
        assertEquals(1, result.get("A"));
        assertEquals(5, result.get("B"));
        assertEquals(4, result.get("C"));
    }
}
