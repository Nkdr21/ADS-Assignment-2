import java.util.LinkedList;

public class AccountManager {
    private LinkedList<BankAccount> accounts = new LinkedList<>();

    public void addAccount(String accountNumber, String username, double balance) {
        BankAccount account = new BankAccount(accountNumber, username, balance);
        accounts.add(account);
        System.out.println("Account added successfully");
    }

    public void displayAll() {
        if (accounts.isEmpty()) {
            System.out.println("No accounts found.");
            return;
        }
        System.out.println("Accounts List:");
        int i = 1;
        for (BankAccount acc : accounts) {
            System.out.println(i + ". " + acc.username + " - Balance: " + (int) acc.balance);
            i++;
        }
    }

    public BankAccount searchByUsername(String username) {
        for (BankAccount acc : accounts) {
            if (acc.username.equalsIgnoreCase(username)) {
                return acc;
            }
        }
        System.out.println("Account not found.");
        return null;
    }

    // Task 2 - Deposit
    public void deposit(String username, double amount) {
        BankAccount acc = searchByUsername(username);
        if (acc != null) {
            acc.balance += amount;
            System.out.println("Deposit: " + (int) amount);
            System.out.println("New balance: " + (int) acc.balance);
        } else {
            System.out.println("Account not found.");
        }
    }

    // Task 2 - Withdraw
    public void withdraw(String username, double amount) {
        BankAccount acc = searchByUsername(username);
        if (acc != null) {
            if (acc.balance >= amount) {
                acc.balance -= amount;
                System.out.println("Withdrawn: " + (int) amount);
                System.out.println("New balance: " + (int) acc.balance);
            } else {
                System.out.println("Insufficient balance!");
            }
        } else {
            System.out.println("Account not found.");
        }
    }
}