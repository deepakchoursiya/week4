package map.key_with_highest_value;

import java.util.*;

public class MaxValueKeyFinder {
    public static String findMaxKey(Map<String, Integer> map) {
        return Collections.max(map.entrySet(), Map.Entry.comparingByValue()).getKey();
    }

    public static void main(String[] args) {
        Map<String, Integer> input = new HashMap<>();
        input.put("A", 1);
        input.put("B", 2);
        input.put("C", 1);
          System.out.println("Key with Max Value: " + findMaxKey(input));
    }
}
