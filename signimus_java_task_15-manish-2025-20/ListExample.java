// Add and retrieve elements from an ArrayList and a LinkedList. java

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Cherry");

        System.out.println("ArrayList Elements:");
        for (String fruit : arrayList) {
            System.out.println(fruit);
        }

        System.out.println("First element in ArrayList: " + arrayList.get(0));

        List<String> linkedList = new LinkedList<>();
        linkedList.add("Dog");
        linkedList.add("Cat");
        linkedList.add("Elephant");

        System.out.println("\nLinkedList Elements:");
        for (String animal : linkedList) {
            System.out.println(animal);
        }

        System.out.println("First element in LinkedList: " + linkedList.get(0));
    }
}
