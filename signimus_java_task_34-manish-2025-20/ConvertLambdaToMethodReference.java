// Convert a lambda expression into a method reference.

import java.util.*;
import java.util.function.*;

public class ConvertLambdaToMethodReference {
    public static void printName(String name) {
        System.out.println(name);
    }

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Aarav", "Diya", "Rohan", "Isha", "Vikram");

        Consumer<String> lambdaPrinter = name -> printName(name);
        names.forEach(lambdaPrinter);

        Consumer<String> methodRefPrinter = ConvertLambdaToMethodReference::printName;
        names.forEach(methodRefPrinter);
    }
}
