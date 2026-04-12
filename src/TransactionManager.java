import java.util.Stack;

public class TransactionManager {
    private Stack<String> transactionHistory = new Stack<>();

    public void addTransaction(String transaction) {
        transactionHistory.push(transaction);
        System.out.println("Transaction added: " + transaction);
    }

    public void undoLastTransaction() {
        if (!transactionHistory.isEmpty()) {
            String removed = transactionHistory.pop();
            System.out.println("Undo → " + removed + " removed");
        } else {
            System.out.println("No transactions to undo.");
        }
    }

    public void showLastTransaction() {
        if (!transactionHistory.isEmpty()) {
            System.out.println("Last transaction: " + transactionHistory.peek());
        } else {
            System.out.println("No transactions found.");
        }
    }

    public void displayAll() {
        if (transactionHistory.isEmpty()) {
            System.out.println("No transactions.");
            return;
        }
        System.out.println("Transaction History:");
        for (String t : transactionHistory) {
            System.out.println("- " + t);
        }
    }
}