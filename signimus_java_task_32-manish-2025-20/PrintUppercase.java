// Given a list of strings, use Consumer<String> and a lambda expression to print each string in uppercase to the console.

import java.util.List;
import java.util.function.Consumer;

public class PrintUppercase {
    public static void main(String[] args) {
        List<String> words = List.of("apple", "banana", "cherry");
        Consumer<String> printUpperCase = word -> System.out.println(word.toUpperCase());
        words.forEach(printUpperCase);
    }
}
