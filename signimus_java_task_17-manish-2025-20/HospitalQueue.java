// priority hospital queue for urgent emergency

import java.util.PriorityQueue;
import java.util.Comparator;

class Patient {
    String name;
    int priority;

    public Patient(String name, int priority) {
        this.name = name;
        this.priority = priority;
    }

    @Override
    public String toString() {
        return name + " (Priority: " + priority + ")";
    }
}

class PatientComparator implements Comparator<Patient> {
    @Override
    public int compare(Patient p1, Patient p2) {
        return Integer.compare(p2.priority, p1.priority);
    }
}

public class HospitalQueue {
    public static void main(String[] args) {
        PriorityQueue<Patient> queue = new PriorityQueue<>(new PatientComparator());

        queue.add(new Patient("Manish", 2));  // Normal checkup
        queue.add(new Patient("Chitranjan", 5));  // Critical emergency
        queue.add(new Patient("Vaishnavi", 3));  // Moderate case
        queue.add(new Patient("Nandani", 4));  // Serious case
        queue.add(new Patient("Navya", 1));   // Mild case

        System.out.println("Attending patients in order of priority:");
        while (!queue.isEmpty()) {
            System.out.println("Attending: " + queue.poll());
        }
    }
}
