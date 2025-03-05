// Given a list of integers, use Predicate<Integer> and a lambda expression to filter out all numbers greater than 10.

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FilterNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(5, 12, 8, 20, 3, 10, 15);
        Predicate<Integer> isGreaterThanTen = num -> num > 10;
        List<Integer> filteredNumbers = numbers.stream()
                                               .filter(isGreaterThanTen.negate())
                                               .collect(Collectors.toList());
        System.out.println(filteredNumbers);
    }
}
