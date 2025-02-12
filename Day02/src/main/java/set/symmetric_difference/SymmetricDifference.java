package set.symmetric_difference;

import java.util.*;

public class SymmetricDifference {
    public static Set<Integer> getSymmetricDifference(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> symmetricDifference = new HashSet<>(set1);
        symmetricDifference.addAll(set2);
        Set<Integer> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);
        symmetricDifference.removeAll(intersection);
        return symmetricDifference;
    }

    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(3, 4, 5));

        System.out.println("Symmetric Difference: " + getSymmetricDifference(set1, set2)); // Output: {1, 2, 4, 5}
    }
}
