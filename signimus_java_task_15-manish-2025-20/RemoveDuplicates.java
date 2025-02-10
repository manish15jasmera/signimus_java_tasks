// Given a list of integers, remove duplicates using a HashSet.

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class RemoveDuplicates {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(20);
        numbers.add(30);
        numbers.add(50);

        System.out.println("Original List: " + numbers);

        HashSet<Integer> uniqueNumbers = new HashSet<>(numbers);

        List<Integer> uniqueList = new ArrayList<>(uniqueNumbers);

        System.out.println("List after removing duplicates: " + uniqueList);
    }
}
