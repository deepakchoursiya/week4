package banking_system_test;

import static org.junit.jupiter.api.Assertions.*;

import banking_system.BankingSystem;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Map;

class BankingSystemTest {
    private BankingSystem bank;

    @BeforeEach
    void setUp() {
        bank = new BankingSystem();
        bank.addAccount(1001, 5000.0);
        bank.addAccount(1002, 3000.0);
        bank.addAccount(1003, 7000.0);
        bank.addAccount(1004, 2500.0);
    }

    @Test
    void testDeposit() {
        bank.deposit(1002, 1000.0);
        assertEquals(4000.0, bank.getAccountsSortedByBalance().get(1002));
    }

    @Test
    void testWithdrawalProcessing() {
        bank.requestWithdrawal(1001);
        bank.processWithdrawals(2000.0);
        assertEquals(3000.0, bank.getAccountsSortedByBalance().get(1001));
    }

    @Test
    void testInsufficientFunds() {
        bank.requestWithdrawal(1004);
        bank.processWithdrawals(3000.0);
        assertEquals(2500.0, bank.getAccountsSortedByBalance().get(1004));
    }

    @Test
    void testSortedAccounts() {
        String[] expectedOrder = { "1004", "1002", "1001", "1003" };
        assertArrayEquals(expectedOrder, bank.getAccountsSortedByBalance().keySet().toArray());
    }
}
