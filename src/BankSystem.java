public class BankSystem {
    public void run() {
        BankAccount[] accounts = new BankAccount[3];

        accounts[0] = new BankAccount("001", "Ali", 150000);
        accounts[1] = new BankAccount("002", "Sara", 220000);
        accounts[2] = new BankAccount("003", "John", 300000);

        System.out.println("=== Bank Accounts (Array) ===");
        for (BankAccount acc : accounts) {
            System.out.println("Account: " + acc.accountNumber +
                    " | Name: " + acc.username +
                    " | Balance: " + (int) acc.balance);
        }
    }
}