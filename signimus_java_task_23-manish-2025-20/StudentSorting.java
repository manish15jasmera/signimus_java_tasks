// task - 23
// Student class> firstName, lastName, age, height, use custom sorting by their 2nd character, Student class> firstName, lastName, age, height, use comparable for natural order sorting by comparing their age.

import java.util.*;

class Student implements Comparable<Student> {
    private String firstName;
    private String lastName;
    private int age;
    private int height;

    public Student(String firstName, String lastName, int age, int height) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.height = height;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public int compareTo(Student other) {
        return Integer.compare(this.age, other.age);
    }

    @Override
    public String toString() {
        return "Student [firstName=" + firstName + ", lastName=" + lastName + 
               ", age=" + age + ", height=" + height + "]";
    }
}

class SecondCharComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        char char1 = s1.getFirstName().charAt(1);
        char char2 = s2.getFirstName().charAt(1);
        return Character.compare(char1, char2);
    }
}

public class StudentSorting {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Ankit", "Sharma", 22, 170));
        students.add(new Student("Vikas", "Yadav", 21, 175));
        students.add(new Student("Pooja", "Verma", 23, 160));
        students.add(new Student("Sumit", "Kumar", 20, 165));
        students.add(new Student("Rahul", "Mishra", 25, 180));

        System.out.println("Sorted by Natural Order (Age):");
        Collections.sort(students);
        students.forEach(System.out::println);

        System.out.println("\nSorted by 2nd Character of First Name:");
        students.sort(new SecondCharComparator());
        students.forEach(System.out::println);
    }
}
