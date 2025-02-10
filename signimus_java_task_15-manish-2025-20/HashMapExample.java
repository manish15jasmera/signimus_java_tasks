// Use a HashMap to store and retrieve student details (roll number, name).

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<Integer, String> studentMap = new HashMap<>();

        studentMap.put(101, "Manish");
        studentMap.put(102, "Chitranjan");
        studentMap.put(103, "Lavish");
        studentMap.put(104, "Rajkumar");

        System.out.println("Student Details (Roll Number -> Name):");
        for (Map.Entry<Integer, String> entry : studentMap.entrySet()) {
            System.out.println("Roll No: " + entry.getKey() + ", Name: " + entry.getValue());
        }

        int searchRollNo = 102;
        System.out.println("\nStudent with Roll No " + searchRollNo + ": " + studentMap.get(searchRollNo));
    }
}
