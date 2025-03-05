// Convert a list of names to uppercase using map().

import java.util.List;
import java.util.stream.Collectors;

public class ConvertNamesToUppercase {
    public static void main(String[] args) {
        List<String> names = List.of("amit", "priya", "rahul", "sita", "vikram");

        List<String> uppercasedNames = names.stream()
                                            .map(String::toUpperCase)
                                            .collect(Collectors.toList());

        System.out.println(uppercasedNames);
    }
}
