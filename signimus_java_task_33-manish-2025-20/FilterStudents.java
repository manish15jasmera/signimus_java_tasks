// Use Stream API to filter a list of students whose marks are above 80.

import java.util.List;
import java.util.stream.Collectors;

class Student {
    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public int getMarks() {
        return marks;
    }
}

public class FilterStudents {
    public static void main(String[] args) {
        List<Student> students = List.of(
            new Student("Amit", 85),
            new Student("Priya", 75),
            new Student("Rahul", 90),
            new Student("Sita", 60),
            new Student("Vikram", 95)
        );

        List<Student> filteredStudents = students.stream()
                                                 .filter(student -> student.getMarks() > 80)
                                                 .collect(Collectors.toList());

        filteredStudents.forEach(student -> System.out.println(student.getName()));
    }
}
