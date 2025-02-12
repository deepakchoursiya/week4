package map.word_frequency_counter_test;

import static org.junit.jupiter.api.Assertions.*;

import map.word_frequency_counter.WordFrequencyCounter;
import org.junit.jupiter.api.Test;
import java.util.Map;

class WordFrequencyCounterTest {
    @Test
    void testWordFrequency() {
        String text = "Hello world, hello Java!";
        Map<String, Integer> result = WordFrequencyCounter.countWordFrequency(text);

        assertEquals(2, result.get("hello"));
        assertEquals(1, result.get("world"));
        assertEquals(1, result.get("java"));
    }
}
