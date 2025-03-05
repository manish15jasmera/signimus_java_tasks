// Find the sum of all numbers in a list using reduce().

import java.util.List;

public class SumUsingReduce {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(10, 20, 30, 40, 50);

        int sum = numbers.stream()
                         .reduce(0, Integer::sum);

        System.out.println("Sum: " + sum);
    }
}
