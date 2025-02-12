package list.rotate;

import java.util.*;

public class RotateList {
    public static List<Integer> rotate(List<Integer> list, int positions) {
        int size = list.size();
        positions = positions % size; // Ensure valid rotation index
        List<Integer> rotated = new ArrayList<>();
        rotated.addAll(list.subList(positions, size));
        rotated.addAll(list.subList(0, positions));
        return rotated;
    }

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);
        System.out.println("Rotated List: " + rotate(numbers, 2));
    }
}
