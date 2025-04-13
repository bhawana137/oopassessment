/*
LL Bank Accounts
The L&L Bank can handle up to 30 customers who have savings accounts. Design and implement a program that manages the customer accounts.
Create an account
Make a deposit
Make a withdrawal Produce appropriate error messages for invalid transactions. Also provide a method to add 3 percent interest to all accounts
when ever the method is called.
*/

package week9;
import java.util.Scanner;

//Represents a bank account with a customer name and balance
class Account {
 private String name;
 private double balance;

 // Constructor with validation for initial deposit
 public Account(String name, double initialDeposit) {
     this.name = name;
     if (initialDeposit >= 0) {
         this.balance = initialDeposit;
     } else {
         System.out.println("Initial deposit must be non-negative. Setting to 0.");
         this.balance = 0;
     }
 }

 public String getName() {
     return name;
 }

 public double getBalance() {
     return balance;
 }

 // Deposits amount if positive
 public void deposit(double amount) {
     if (amount > 0) {
         balance += amount;
     } else {
         System.out.println("Deposit must be greater than 0.");
     }
 }

 // Withdraws amount if valid and sufficient balance exists
 public void withdraw(double amount) {
     if (amount <= 0) {
         System.out.println("Withdrawal must be greater than 0.");
     } else if (amount > balance) {
         System.out.println("Not enough balance.");
     } else {
         balance -= amount;
     }
 }

 // Adds 3% interest to the balance
 public void addInterest() {
     balance *= 1.03;
 }

 // Prints account holder name and balance
 public void printInfo() {
     System.out.printf("Name: %s | Balance: $%.2f%n", name, balance);
 }
}

public class BankApp {
 private static final int MAX_CUSTOMERS = 30; // Max number of customer accounts
 private static Account[] accounts = new Account[MAX_CUSTOMERS];
 private static int numAccounts = 0; // Tracks how many accounts exist

 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     int choice;

     // Menu loop until user chooses to exit
     do {
         System.out.println("\n=== L&L Bank Menu ===");
         System.out.println("1. Create Account");
         System.out.println("2. Make Deposit");
         System.out.println("3. Make Withdrawal");
         System.out.println("4. Add 3% Interest to All Accounts");
         System.out.println("5. Show All Accounts");
         System.out.println("6. Exit");
         System.out.print("Choose an option (1-6): ");
         choice = scanner.nextInt();
         scanner.nextLine(); 

         // Handle menu options
         switch (choice) {
             case 1 -> createAccount(scanner);
             case 2 -> makeDeposit(scanner);
             case 3 -> makeWithdrawal(scanner);
             case 4 -> addInterestToAll();
             case 5 -> showAllAccounts();
             case 6 -> System.out.println("Thank you for banking with L&L Bank!");
             default -> System.out.println("Invalid option. Try again.");
         }
     } while (choice != 6);

     scanner.close();
 }

 // Creates a new account if space is available
 private static void createAccount(Scanner scanner) {
     if (numAccounts >= MAX_CUSTOMERS) {
         System.out.println("Bank is full. Cannot add more accounts.");
         return;
     }

     System.out.print("Enter customer name: ");
     String name = scanner.nextLine();
     System.out.print("Enter initial deposit: ");
     double deposit = scanner.nextDouble();

     accounts[numAccounts] = new Account(name, deposit);
     numAccounts++;
     System.out.println("Account created successfully!");
 }

 // Finds an account and makes a deposit
 private static void makeDeposit(Scanner scanner) {
     Account acc = findAccount(scanner);
     if (acc != null) {
         System.out.print("Enter deposit amount: ");
         double amount = scanner.nextDouble();
         acc.deposit(amount);
     }
 }

 // Finds an account and makes a withdrawal
 private static void makeWithdrawal(Scanner scanner) {
     Account acc = findAccount(scanner);
     if (acc != null) {
         System.out.print("Enter withdrawal amount: ");
         double amount = scanner.nextDouble();
         acc.withdraw(amount);
     }
 }

 // Adds 3% interest to all existing accounts
 private static void addInterestToAll() {
     for (int i = 0; i < numAccounts; i++) {
         accounts[i].addInterest();
     }
     System.out.println("3% interest added to all accounts.");
 }

 // Displays all account details
 private static void showAllAccounts() {
     if (numAccounts == 0) {
         System.out.println("No accounts to show.");
     } else {
         for (int i = 0; i < numAccounts; i++) {
             accounts[i].printInfo();
         }
     }
 }

 // Finds an account based on customer name input
 private static Account findAccount(Scanner scanner) {
     System.out.print("Enter customer name: ");
     String name = scanner.nextLine();

     for (int i = 0; i < numAccounts; i++) {
         if (accounts[i].getName().equalsIgnoreCase(name)) {
             return accounts[i];
         }
     }

     System.out.println("Account not found.");
     return null;
 }
}
