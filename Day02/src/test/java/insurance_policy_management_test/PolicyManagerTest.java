package insurance_policy_management_test;

import insurance_policy_management.InsurancePolicy;
import insurance_policy_management.PolicyManager;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.*;

class PolicyManagerTest {
    @Test
    void testAddAndRetrievePolicies() {
        PolicyManager manager = new PolicyManager();
        InsurancePolicy policy1 = new InsurancePolicy("P123", "Alice", LocalDate.now().plusDays(15), "Health", 5000);
        InsurancePolicy policy2 = new InsurancePolicy("P124", "Bob", LocalDate.now().plusDays(40), "Auto", 6000);

        manager.addPolicy(policy1);
        manager.addPolicy(policy2);

        assertEquals(2, manager.getAllPolicies().size());
    }

    @Test
    void testExpiringSoonPolicies() {
        PolicyManager manager = new PolicyManager();
        InsurancePolicy policy = new InsurancePolicy("P125", "Charlie", LocalDate.now().plusDays(10), "Home", 7000);
        manager.addPolicy(policy);

        assertEquals(1, manager.getExpiringSoon().size());
    }

    @Test
    void testFindDuplicatePolicies() {
        PolicyManager manager = new PolicyManager();
        InsurancePolicy policy = new InsurancePolicy("P123", "Alice", LocalDate.now().plusDays(15), "Health", 5000);
        manager.addPolicy(policy);
        manager.addPolicy(policy);

        assertEquals(1, manager.findDuplicatePolicies().size());
    }
}
