// sort a list of Person objects based on the second character of their names. Using lambda expression using comparator.

import java.util.Comparator;
import java.util.List;

class Person {
    String name;

    Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

public class SortBySecondChar {
    public static void main(String[] args) {
        List<Person> people = List.of(
            new Person("Manish"),
            new Person("Bablu"),
            new Person("Chitranjan"),
            new Person("Deepak")
        );

        people.stream()
              .sorted(Comparator.comparing(person -> person.getName().charAt(1)))
              .forEach(person -> System.out.println(person.getName()));
    }
}
