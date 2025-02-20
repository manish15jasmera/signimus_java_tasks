// Task 1: Iterator Practice
// Create an ArrayList of student names.
// Use an Iterator to print all student names.
// Remove a student whose name starts with "A" using Iterator.


import java.util.ArrayList;
import java.util.Iterator;

public class StudentIterator {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();
        students.add("Akash");
        students.add("Bakul");
        students.add("Anant");
        students.add("Chitranjan");
        students.add("Anuj");

        System.out.println("Student List:");
        Iterator<String> iterator = students.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        iterator = students.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().startsWith("A")) {
                iterator.remove();
            }
        }

        System.out.println("\nUpdated Student List (After Removal):");
        for (String student : students) {
            System.out.println(student);
        }
    }
}
