package insurance_policy;



import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        InsurancePolicyManagement manager = new InsurancePolicyManagement();

        // Adding policies
        manager.addPolicy(new InsurancePolicy("P001", "Alice", LocalDate.now().plusDays(10), "Health", 5000));
        manager.addPolicy(new InsurancePolicy("P002", "Bob", LocalDate.now().plusDays(40), "Auto", 7000));
        manager.addPolicy(new InsurancePolicy("P003", "Alice", LocalDate.now().plusDays(5), "Home", 3000));
        manager.addPolicy(new InsurancePolicy("P004", "Charlie", LocalDate.now().minusDays(5), "Health", 6000));

        // Fetch and display policies
        System.out.println("Policy by Number (P001): " + manager.getPolicyByNumber("P001"));
        System.out.println("Policies Expiring Soon: " + manager.getPoliciesExpiringSoon());
        System.out.println("Policies for Alice: " + manager.getPoliciesByHolder("Alice"));

        // Remove expired policies
        System.out.println("Removing expired policies...");
        manager.removeExpiredPolicies();

        // Display remaining policies
        manager.printAllPolicies();
    }
}

