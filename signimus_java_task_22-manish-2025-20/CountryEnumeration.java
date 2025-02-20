// Task 3: Enumeration Practice
// Create a Vector of country names.
// Use Enumeration to print all country names.

import java.util.Vector;
import java.util.Enumeration;

public class CountryEnumeration {
    public static void main(String[] args) {
        Vector<String> countries = new Vector<>();
        countries.add("India");
        countries.add("USA");
        countries.add("Canada");
        countries.add("Australia");
        countries.add("Germany");

        Enumeration<String> enumeration = countries.elements();
        System.out.println("Country Names:");
        while (enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement());
        }
    }
}
