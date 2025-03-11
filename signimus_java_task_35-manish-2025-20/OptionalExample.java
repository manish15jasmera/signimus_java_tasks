// Implement a method that returns an Optional object to avoid NullPointerException.

import java.util.Optional;

public class OptionalExample {
    public static Optional<String> getUserName(String name) {
        return Optional.ofNullable(name);
    }

    public static void main(String[] args) {
        String name1 = "Aarav";
        String name2 = null;

        Optional<String> optionalName1 = getUserName(name1);
        Optional<String> optionalName2 = getUserName(name2);

        optionalName1.ifPresentOrElse(
            System.out::println,
            () -> System.out.println("Name is not available")
        );

        optionalName2.ifPresentOrElse(
            System.out::println,
            () -> System.out.println("Name is not available")
        );
    }
}
