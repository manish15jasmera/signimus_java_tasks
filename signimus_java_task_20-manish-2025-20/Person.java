// 2. Immutable Class: Person
// Create an immutable class Person to represent a person with the following attributes:

// firstName (String)
// lastName (String)
// dateOfBirth (LocalDate)
// Make the class immutable:

// Declare all fields as final.
// Use a constructor to initialize all fields.
// Do not provide any setter methods.
// Implement the following methods:

// String getFullName(): Returns the full name of the person (e.g., "John Doe").
// int getAge(): Calculates and returns the current age of the person based on the dateOfBirth.

import java.time.LocalDate;
import java.time.Period;

public final class Person {
    private final String firstName;
    private final String lastName;
    private final LocalDate dateOfBirth;

    public Person(String firstName, String lastName, LocalDate dateOfBirth) {
        if (firstName == null || lastName == null || dateOfBirth == null) {
            throw new IllegalArgumentException("Fields cannot be null");
        }
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public int getAge() {
        return Period.between(dateOfBirth, LocalDate.now()).getYears();
    }

    public static void main(String[] args) {
        Person person = new Person("Manish", "Jasmera", LocalDate.of(1996, 8, 15));
        System.out.println("Full Name: " + person.getFullName());
        System.out.println("Age: " + person.getAge());
    }
}
