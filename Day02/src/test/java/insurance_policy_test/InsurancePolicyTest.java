package insurance_policy_test;

import static org.junit.jupiter.api.Assertions.*;

import insurance_policy.InsurancePolicy;
import insurance_policy.InsurancePolicyManagement;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import java.util.List;

class InsurancePolicyTest {
    private InsurancePolicyManagement manager;

    @BeforeEach
    void setUp() {
        manager = new InsurancePolicyManagement();
        manager.addPolicy(new InsurancePolicy("P001", "Alice", LocalDate.now().plusDays(10), "Health", 5000));
        manager.addPolicy(new InsurancePolicy("P002", "Bob", LocalDate.now().plusDays(40), "Auto", 7000));
        manager.addPolicy(new InsurancePolicy("P003", "Alice", LocalDate.now().plusDays(5), "Home", 3000));
        manager.addPolicy(new InsurancePolicy("P004", "Charlie", LocalDate.now().minusDays(5), "Health", 6000));
    }

    @Test
    void testGetPolicyByNumber() {
        assertNotNull(manager.getPolicyByNumber("P001"));
        assertNull(manager.getPolicyByNumber("P999"));
    }

    @Test
    void testGetPoliciesExpiringSoon() {
        List<InsurancePolicy> expiringSoon = manager.getPoliciesExpiringSoon();
        assertEquals(2, expiringSoon.size());
    }

    @Test
    void testGetPoliciesByHolder() {
        List<InsurancePolicy> alicePolicies = manager.getPoliciesByHolder("Alice");
        assertEquals(2, alicePolicies.size());
    }

    @Test
    void testRemoveExpiredPolicies() {
        manager.removeExpiredPolicies();
        assertNull(manager.getPolicyByNumber("P004")); // Expired policy should be removed
    }
}
