// Task 2: ListIterator Practice
// Create a LinkedList of city names.
// Use a ListIterator to traverse the list forward and print all cities.
// Then, traverse the list in reverse order and print the cities again.


import java.util.LinkedList;
import java.util.ListIterator;

public class IndianCitiesIterator {
    public static void main(String[] args) {
        LinkedList<String> cities = new LinkedList<>();
        cities.add("Mumbai");
        cities.add("Delhi");
        cities.add("Bangalore");
        cities.add("Hyderabad");
        cities.add("Chennai");

        ListIterator<String> listIterator = cities.listIterator();
        System.out.println("Indian Cities in Forward Order:");
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }

        System.out.println("\nIndian Cities in Reverse Order:");
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }
    }
}
