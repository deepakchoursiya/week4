package banking_system;

import java.util.*;

public class BankingSystem {
    private Map<Integer, Double> accounts = new HashMap<>();
    private Queue<Integer> withdrawalQueue = new LinkedList<>();

    // Add a new account
    public void addAccount(int accountNumber, double balance) {
        accounts.put(accountNumber, balance);
    }

    // Deposit money into an account
    public void deposit(int accountNumber, double amount) {
        accounts.put(accountNumber, accounts.getOrDefault(accountNumber, 0.0) + amount);
    }

    // Request a withdrawal
    public void requestWithdrawal(int accountNumber) {
        if (accounts.containsKey(accountNumber)) {
            withdrawalQueue.add(accountNumber);
        } else {
            System.out.println("Account not found!");
        }
    }

    // Process withdrawal requests
    public void processWithdrawals(double amount) {
        while (!withdrawalQueue.isEmpty()) {
            int accountNumber = withdrawalQueue.poll();
            if (accounts.get(accountNumber) >= amount) {
                accounts.put(accountNumber, accounts.get(accountNumber) - amount);
                System.out.println("Withdrawal of $" + amount + " from Account " + accountNumber + " successful.");
            } else {
                System.out.println("Insufficient funds in Account " + accountNumber);
            }
        }
    }

    // Get accounts sorted by balance (value)
    public Map<Integer, Double> getAccountsSortedByBalance() {
        List<Map.Entry<Integer, Double>> sortedEntries = new ArrayList<>(accounts.entrySet());

        // Sort by balance (value)
        sortedEntries.sort(Map.Entry.comparingByValue());

        // Preserve sorted order in LinkedHashMap
        Map<Integer, Double> sortedMap = new LinkedHashMap<>();
        for (Map.Entry<Integer, Double> entry : sortedEntries) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }

        return sortedMap;
    }

    // Display all accounts
    public void displayAccounts() {
        System.out.println("All Accounts: " + accounts);
        System.out.println("Accounts Sorted by Balance: " + getAccountsSortedByBalance());
    }

    public static void main(String[] args) {
        BankingSystem bank = new BankingSystem();

        // Adding accounts
        bank.addAccount(1001, 5000.0);
        bank.addAccount(1002, 3000.0);
        bank.addAccount(1003, 7000.0);
        bank.addAccount(1004, 2500.0);

        // Deposit money
        bank.deposit(1002, 1000.0);

        // Request withdrawals
        bank.requestWithdrawal(1001);
        bank.requestWithdrawal(1003);

        // Process withdrawals
        bank.processWithdrawals(2000.0);

        // Display sorted accounts
        bank.displayAccounts();
    }
}
