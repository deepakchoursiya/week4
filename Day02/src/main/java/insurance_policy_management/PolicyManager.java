package insurance_policy_management;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.*;

public class PolicyManager {
    private Set<InsurancePolicy> hashSetPolicies = new HashSet<>();
    private Set<InsurancePolicy> linkedHashSetPolicies = new LinkedHashSet<>();
    private Set<InsurancePolicy> treeSetPolicies = new TreeSet<>();

    public void addPolicy(InsurancePolicy policy) {
        hashSetPolicies.add(policy);
        linkedHashSetPolicies.add(policy);
        treeSetPolicies.add(policy);
    }

    public Set<InsurancePolicy> getAllPolicies() {
        return new HashSet<>(hashSetPolicies);
    }

    public Set<InsurancePolicy> getExpiringSoon() {
        Set<InsurancePolicy> expiringSoon = new HashSet<>();
        LocalDate today = LocalDate.now();
        for (InsurancePolicy policy : hashSetPolicies) {
            long daysLeft = ChronoUnit.DAYS.between(today, policy.getExpiryDate());
            if (daysLeft > 0 && daysLeft <= 30) {
                expiringSoon.add(policy);
            }
        }
        return expiringSoon;
    }

    public Set<InsurancePolicy> getPoliciesByCoverage(String coverageType) {
        Set<InsurancePolicy> result = new HashSet<>();
        for (InsurancePolicy policy : hashSetPolicies) {
            if (policy.getCoverageType().equalsIgnoreCase(coverageType)) {
                result.add(policy);
            }
        }
        return result;
    }

    public Set<InsurancePolicy> findDuplicatePolicies() {
        Set<String> seen = new HashSet<>();
        Set<InsurancePolicy> duplicates = new HashSet<>();
        for (InsurancePolicy policy : hashSetPolicies) {
            if (!seen.add(policy.getPolicyNumber())) {
                duplicates.add(policy);
            }
        }
        return duplicates;
    }
}
