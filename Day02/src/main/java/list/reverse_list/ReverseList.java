package list.reverse_list;

import java.util.*;

public class ReverseList {
    public static List<Integer> reverseList(List<Integer> list) {
        List<Integer> reversed = new ArrayList<>();
        for (int i = list.size() - 1; i >= 0; i--) {
            reversed.add(list.get(i));
        }
        return reversed;
    }

    public static void main(String[] args) {
        List<Integer> arrayList = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println("Reversed ArrayList: " + reverseList(arrayList));

        LinkedList<Integer> linkedList = new LinkedList<>(arrayList);
        System.out.println("Reversed LinkedList: " + reverseList(linkedList));
    }
}
