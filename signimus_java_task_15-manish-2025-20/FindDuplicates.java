// Write a program to find duplicate elements in an ArrayList.

import java.util.ArrayList;
import java.util.HashSet;

public class FindDuplicates {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(20);
        numbers.add(30);
        numbers.add(50);

        HashSet<Integer> uniqueSet = new HashSet<>();
        HashSet<Integer> duplicateSet = new HashSet<>();

        for (Integer num : numbers) {
            if (!uniqueSet.add(num)) {
                duplicateSet.add(num);
            }
        }

        System.out.println("Duplicate elements in the ArrayList: " + duplicateSet);
    }
}
