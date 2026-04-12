import java.util.LinkedList;
import java.util.Queue;

public class BillQueueManager {
    private Queue<String> billQueue = new LinkedList<>();

    public void addBill(String bill) {
        billQueue.add(bill);
        System.out.println("Added: " + bill);
    }

    public void processNextBill() {
        if (!billQueue.isEmpty()) {
            String processed = billQueue.poll();
            System.out.println("Processing: " + processed);
        } else {
            System.out.println("No bills in queue.");
        }
    }

    public void displayQueue() {
        if (billQueue.isEmpty()) {
            System.out.println("Bill queue is empty.");
            return;
        }
        System.out.println("Remaining bills:");
        for (String bill : billQueue) {
            System.out.println("- " + bill);
        }
    }
}