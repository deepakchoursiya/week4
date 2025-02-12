package insurance_policy_management;

import java.time.LocalDate;

public class PerformanceTest {
    public static void main(String[] args) {
        PolicyManager manager = new PolicyManager();
        int numPolicies = 100000;

        long start, end;

        // HashSet Performance
        start = System.nanoTime();
        for (int i = 0; i < numPolicies; i++) {
            manager.addPolicy(new InsurancePolicy("P" + i, "Holder" + i, LocalDate.now().plusDays(i), "Health", 1000));
        }
        end = System.nanoTime();
        System.out.println("HashSet Insertion Time: " + (end - start) / 1e6 + " ms");

        // TreeSet Performance
        start = System.nanoTime();
        for (int i = 0; i < numPolicies; i++) {
            manager.addPolicy(new InsurancePolicy("T" + i, "Holder" + i, LocalDate.now().plusDays(i), "Health", 1000));
        }
        end = System.nanoTime();
        System.out.println("TreeSet Insertion Time: " + (end - start) / 1e6 + " ms");
    }
}
