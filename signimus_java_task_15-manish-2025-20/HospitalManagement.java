// Hospital class and patient class use priorityQueue and according to their priority you have attend the patient.

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
        return "Patient{name='" + name + "', priority=" + priority + "}";
    }
}

class Hospital {
    private PriorityQueue<Patient> patientQueue;

    public Hospital() {
        patientQueue = new PriorityQueue<>(Comparator.comparingInt(p -> -p.priority));
    }

    public void addPatient(String name, int priority) {
        patientQueue.add(new Patient(name, priority));
    }

    public void attendPatients() {
        while (!patientQueue.isEmpty()) {
            System.out.println("Attending: " + patientQueue.poll());
        }
    }
}

public class HospitalManagement {
    public static void main(String[] args) {
        Hospital hospital = new Hospital();

        hospital.addPatient("Manish", 2);
        hospital.addPatient("Chitranjan", 5);
        hospital.addPatient("Lavish", 1);
        hospital.addPatient("Rajkumar", 4);

        System.out.println("Patients are attended in the order of priority:");
        hospital.attendPatients();
    }
}
