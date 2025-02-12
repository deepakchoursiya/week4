package queue.hospital_triage_system_test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import queue.hospital_triage_system.HospitalTriage;

class HospitalTriageTest {
    @Test
    void testTriageSystem() {
        HospitalTriage triage = new HospitalTriage();
        triage.addPatient("John", 3);
        triage.addPatient("Alice", 5);
        triage.addPatient("Bob", 2);

        assertEquals("Alice", triage.treatNextPatient());
        assertEquals("John", triage.treatNextPatient());
        assertEquals("Bob", triage.treatNextPatient());
    }
}
