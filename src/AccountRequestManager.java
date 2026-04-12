import java.util.LinkedList;
import java.util.Queue;

public class AccountRequestManager {
    private Queue<BankAccount> accountRequests = new LinkedList<>();

    public void addRequest(BankAccount account) {
        accountRequests.add(account);
        System.out.println("Request submitted for: " + account.username);
    }

    public void processRequest(AccountManager accountManager) {
        if (!accountRequests.isEmpty()) {
            BankAccount acc = accountRequests.poll();
            accountManager.addAccount(acc.accountNumber, acc.username, acc.balance);
            System.out.println("Account approved and created for: " + acc.username);
        } else {
            System.out.println("No pending requests.");
        }
    }

    public void displayPending() {
        if (accountRequests.isEmpty()) {
            System.out.println("No pending requests.");
            return;
        }
        System.out.println("Pending requests:");
        for (BankAccount acc : accountRequests) {
            System.out.println("- " + acc.username);
        }
    }
}