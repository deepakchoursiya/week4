package map.word_frequency_counter;

import java.io.*;
import java.util.*;

public class WordFrequencyCounter {
    public static Map<String, Integer> countWordFrequency(String text) {
        Map<String, Integer> frequencyMap = new HashMap<>();
        text = text.toLowerCase().replaceAll("[^a-z\\s]", ""); // Normalize text

        String[] words = text.split("\\s+");
        for (String word : words) {
            frequencyMap.put(word, frequencyMap.getOrDefault(word, 0) + 1);
        }
        return frequencyMap;
    }

    public static void main(String[] args) {
        String input = "Hello world, hello Java!";
        Map<String, Integer> result = countWordFrequency(input);
        System.out.println("Word Frequency: " + result);
    }
}
