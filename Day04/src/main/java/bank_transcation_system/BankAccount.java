package bank_transcation_system;



public class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void withdraw(double amount) throws InsufficientBalanceException {
        if (amount < 0) {
            throw new IllegalArgumentException("Invalid amount!");
        }
        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient balance!");
        }
        balance -= amount;
        System.out.println("Withdrawal successful, new balance: " + balance);
    }

    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000);

        try {
            account.withdraw(500); // Valid withdrawal
            account.withdraw(700); // Insufficient balance
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            account.withdraw(-100); // Invalid amount
        } catch (IllegalArgumentException | InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }
    }
}
