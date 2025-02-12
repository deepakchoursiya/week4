package queue.hospital_triage_system;

import java.util.PriorityQueue;


public class HospitalTriage {
    private PriorityQueue<Patient> queue = new PriorityQueue<>();

    public void addPatient(String name, int severity) {
        queue.offer(new Patient(name, severity));
    }

    public String treatNextPatient() {
        return queue.isEmpty() ? null : queue.poll().name;
    }

    public static void main(String[] args) {
        HospitalTriage triage = new HospitalTriage();
        triage.addPatient("Deepak", 3);
        triage.addPatient("Aman", 5);
        triage.addPatient("BabuBhai", 2);

        System.out.println("Treating patients:");
        System.out.println(triage.treatNextPatient());
        System.out.println(triage.treatNextPatient());
        System.out.println(triage.treatNextPatient());
    }
}
