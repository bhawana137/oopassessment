package week5;
public class BankAccount {
    public static void main(String[] args) {
        // Create an account with account number "12345" and holder name "Bhawana"
        Account account = new Account("12345", "Bhawana");

        // Display initial account details
        System.out.println("Account Created:");
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Account Holder: " + account.getAccountHolderName());
        System.out.println("Initial Balance: $" + account.getBalance());

        // Perform transactions
        account.deposit(500.0);  // Deposit $500
        account.withdraw(200.0); // Withdraw $200

        // Display final balance
        System.out.println("\nFinal Balance: $" + account.getBalance());
    }
}

class Account {
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    // Constructor to create an account with account number and holder name, balance starts at zero
    public Account(String accountNumber, String accountHolderName) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = 0.0; // Initial balance is zero
    }

    // Getter methods
    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("$" + amount + " deposited successfully.");
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("$" + amount + " withdrawn successfully.");
        } else {
            System.out.println("Invalid withdrawal amount or insufficient funds.");
        }
    }
}

