import java.util.Scanner;

abstract class BankAccount {
    private String accountNumber;
    protected double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: $" + amount);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient funds.");
        }
    }

    public abstract void applyMonthlyFeeOrInterest();

    public void displayBalance() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: $" + balance);
    }
}

class SavingsAccount extends BankAccount {
    private static final double INTEREST_RATE = 0.04;

    public SavingsAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public void applyMonthlyFeeOrInterest() {
        double interest = balance * INTEREST_RATE;
        balance += interest;
        System.out.println("Interest applied: $" + interest);
    }
}

class CheckingAccount extends BankAccount {
    private static final double MINIMUM_BALANCE = 500.00;
    private static final double FEE = 50.00;

    public CheckingAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public void applyMonthlyFeeOrInterest() {
        if (balance < MINIMUM_BALANCE) {
            balance -= FEE;
            System.out.println("Fee charged: $" + FEE);
        }
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && balance - amount >= 0) {
            super.withdraw(amount);
            if (balance < MINIMUM_BALANCE) {
                balance -= FEE;
                System.out.println("Fee charged for falling below minimum balance: $" + FEE);
            }
        } else {
            System.out.println("Invalid withdrawal amount or insufficient funds.");
        }
    }
}

public class S02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Test Case 1: Savings Account Deposit");
        SavingsAccount savingsAccount = new SavingsAccount("S123", 1000);
        savingsAccount.deposit(500);
        savingsAccount.displayBalance();
        System.out.println("\nTest Case 2: Checking Account Withdrawal");
        CheckingAccount checkingAccount = new CheckingAccount("C123", 600);
        checkingAccount.withdraw(200);
        checkingAccount.displayBalance();
        System.out.println("\nTest Case 3: Savings Account Interest Application");
        savingsAccount.applyMonthlyFeeOrInterest();
        savingsAccount.displayBalance();
        System.out.println("\nTest Case 4: Checking Account Minimum Balance Fee");
        CheckingAccount anotherCheckingAccount = new CheckingAccount("C456", 400);
        anotherCheckingAccount.withdraw(100);
        anotherCheckingAccount.displayBalance();

        scanner.close();
    }
}
