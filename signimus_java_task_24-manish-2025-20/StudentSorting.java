// Create a list of Student objects with sample data.
// Use Collections.sort() to sort the list:
// Once using the natural ordering (based on name).
// Once using the AgeComparator.
// Once using the RollNumberComparator.
// Print the sorted lists to verify the correctness of the sorting.


import java.util.*;

class Student implements Comparable<Student> {
    private String name;
    private int age;
    private int rollNumber;

    public Student(String name, int age, int rollNumber) {
        this.name = name;
        this.age = age;
        this.rollNumber = rollNumber;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    @Override
    public int compareTo(Student other) {
        return this.name.compareTo(other.name);
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", age=" + age + ", rollNumber=" + rollNumber + "]";
    }
}

class AgeComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return Integer.compare(s1.getAge(), s2.getAge());
    }
}

class RollNumberComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return Integer.compare(s1.getRollNumber(), s2.getRollNumber());
    }
}

public class StudentSorting {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Ankit", 22, 104));
        students.add(new Student("Vikas", 21, 102));
        students.add(new Student("Pooja", 23, 101));
        students.add(new Student("Sumit", 20, 105));
        students.add(new Student("Rahul", 25, 103));

        Collections.sort(students);
        System.out.println("Sorted by Name:");
        students.forEach(System.out::println);

        students.sort(new AgeComparator());
        System.out.println("\nSorted by Age:");
        students.forEach(System.out::println);

        students.sort(new RollNumberComparator());
        System.out.println("\nSorted by Roll Number:");
        students.forEach(System.out::println);
    }
}
