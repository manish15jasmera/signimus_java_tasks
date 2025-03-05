// Given a list of strings, use Function<String, String> and a lambda expression to convert each string to uppercase.

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ConvertToUppercase {
    public static void main(String[] args) {
        List<String> words = List.of("apple", "banana", "cherry");
        Function<String, String> toUpperCase = String::toUpperCase;
        List<String> uppercasedWords = words.stream()
                                            .map(toUpperCase)
                                            .collect(Collectors.toList());
        System.out.println(uppercasedWords);
    }
}
