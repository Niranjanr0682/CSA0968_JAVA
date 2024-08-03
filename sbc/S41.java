// Custom exception for insufficient funds
class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

// Custom exception for negative amounts
class NegativeAmountException extends Exception {
    public NegativeAmountException(String message) {
        super(message);
    }
}

// BankAccount class that handles deposit and withdrawal
public class S41 {
    private double balance;

    public S41(double initialBalance) {
        if (initialBalance < 0) {
            throw new IllegalArgumentException("Initial balance cannot be negative.");
        }
        this.balance = initialBalance;
    }

    public void deposit(double amount) throws NegativeAmountException {
        if (amount < 0) {
            throw new NegativeAmountException("Deposit amount cannot be negative.");
        }
        balance += amount;
        System.out.println("Deposited: $" + amount);
        displayBalance();
    }

    public void withdraw(double amount) throws InsufficientFundsException, NegativeAmountException {
        if (amount < 0) {
            throw new NegativeAmountException("Withdrawal amount cannot be negative.");
        }
        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient funds for this withdrawal.");
        }
        balance -= amount;
        System.out.println("Withdrew: $" + amount);
        displayBalance();
    }

    public void displayBalance() {
        System.out.println("Current balance: $" + balance);
    }

    public static void main(String[] args) {
        try {
            S41 account = new S41(1000.00);
            account.displayBalance();
            account.deposit(500.00);
            account.withdraw(200.00);
            account.withdraw(1500.00); // This will throw InsufficientFundsException
        } catch (InsufficientFundsException | NegativeAmountException e) {
            System.err.println(e.getMessage());
        }
    }
}
