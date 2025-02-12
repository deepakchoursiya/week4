package insurance_policy;



import java.time.LocalDate;
import java.util.*;

public class InsurancePolicyManagement {
    private Map<String, InsurancePolicy> policyHashMap = new HashMap<>();
    private Map<String, InsurancePolicy> policyLinkedHashMap = new LinkedHashMap<>();
    private TreeMap<LocalDate, InsurancePolicy> policyTreeMap = new TreeMap<>();

    public void addPolicy(InsurancePolicy policy) {
        policyHashMap.put(policy.getPolicyNumber(), policy);
        policyLinkedHashMap.put(policy.getPolicyNumber(), policy);
        policyTreeMap.put(policy.getExpiryDate(), policy);
    }

    public InsurancePolicy getPolicyByNumber(String policyNumber) {
        return policyHashMap.get(policyNumber);
    }

    public List<InsurancePolicy> getPoliciesExpiringSoon() {
        LocalDate today = LocalDate.now();
        LocalDate limit = today.plusDays(30);
        return new ArrayList<>(policyTreeMap.subMap(today, limit).values());
    }

    public List<InsurancePolicy> getPoliciesByHolder(String holderName) {
        List<InsurancePolicy> result = new ArrayList<>();
        for (InsurancePolicy policy : policyHashMap.values()) {
            if (policy.getPolicyholderName().equalsIgnoreCase(holderName)) {
                result.add(policy);
            }
        }
        return result;
    }

    public void removeExpiredPolicies() {
        LocalDate today = LocalDate.now();

        // Collect expired keys first to avoid ConcurrentModificationException
        List<LocalDate> expiredDates = new ArrayList<>(policyTreeMap.headMap(today, true).keySet());

        for (LocalDate date : expiredDates) {
            InsurancePolicy policy = policyTreeMap.remove(date);
            if (policy != null) {
                policyHashMap.remove(policy.getPolicyNumber());
                policyLinkedHashMap.remove(policy.getPolicyNumber());
            }
        }
    }

    public void printAllPolicies() {
        System.out.println("Current Policies: " + policyHashMap.values());
    }
}
