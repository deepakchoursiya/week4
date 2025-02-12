package list_test.frequencyTest;

import list.frequency.FrequencyCounter;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class FrequencyCounterTest {
    @Test
    void testCountFrequency() {
        List<String> input = Arrays.asList("apple", "banana", "apple", "orange");
        Map<String, Integer> expected = new HashMap<>();
        expected.put("apple", 2);
        expected.put("banana", 1);
        expected.put("orange", 1);
        assertEquals(expected, FrequencyCounter.countFrequency(input));
    }

    @Test
    void testCountFrequencyWithEmptyList() {
        List<String> input = Arrays.asList();
        Map<String, Integer> expected = new HashMap<>();
        assertEquals(expected, FrequencyCounter.countFrequency(input));
    }
}
