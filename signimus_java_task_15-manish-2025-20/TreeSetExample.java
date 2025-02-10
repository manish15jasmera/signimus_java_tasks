// Demonstrate insertion order and sorting in TreeSet.

import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();

        treeSet.add(50);
        treeSet.add(10);
        treeSet.add(30);
        treeSet.add(40);
        treeSet.add(20);

        System.out.println("TreeSet elements (Sorted Order): " + treeSet);

        System.out.println("Attempted insertion order: [50, 10, 30, 40, 20]");
        System.out.println("Actual order in TreeSet: " + treeSet);
    }
}
