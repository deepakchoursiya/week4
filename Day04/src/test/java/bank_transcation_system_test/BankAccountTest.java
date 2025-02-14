package bank_transcation_system_test;

import bank_transcation_system.BankAccount;
import bank_transcation_system.InsufficientBalanceException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {
    @Test
    void testValidWithdrawal() throws InsufficientBalanceException {
        BankAccount account = new BankAccount(1000);
        account.withdraw(500);
        assertEquals(500, account.getBalance());
    }

    @Test
    void testInsufficientBalance() {
        BankAccount account = new BankAccount(500);
        assertThrows(InsufficientBalanceException.class, () -> account.withdraw(600));
    }

    @Test
    void testNegativeAmount() {
        BankAccount account = new BankAccount(500);
        assertThrows(IllegalArgumentException.class, () -> account.withdraw(-100));
    }
}
