package insurance_policy_management;


import java.time.LocalDate;

public class InsuranceSystem {
    public static void main(String[] args) {
        PolicyManager manager = new PolicyManager();

        // Adding sample policies
        manager.addPolicy(new InsurancePolicy("P123", "Alice", LocalDate.now().plusDays(15), "Health", 5000));
        manager.addPolicy(new InsurancePolicy("P124", "Bob", LocalDate.now().plusDays(40), "Auto", 6000));
        manager.addPolicy(new InsurancePolicy("P125", "Charlie", LocalDate.now().plusDays(10), "Home", 7000));
        manager.addPolicy(new InsurancePolicy("P126", "Dave", LocalDate.now().plusDays(5), "Health", 8000));
        manager.addPolicy(new InsurancePolicy("P123", "Alice", LocalDate.now().plusDays(15), "Health", 5000)); // Duplicate

        System.out.println("All Policies: " + manager.getAllPolicies());
        System.out.println("Policies Expiring Soon: " + manager.getExpiringSoon());
        System.out.println("Health Policies: " + manager.getPoliciesByCoverage("Health"));
        System.out.println("Duplicate Policies: " + manager.findDuplicatePolicies());
    }
}

