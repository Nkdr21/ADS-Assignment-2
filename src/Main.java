import java.util.Scanner;

public class Main {
    static AccountManager manager = new AccountManager();
    static TransactionManager transactionManager = new TransactionManager();
    static BillQueueManager billQueueManager = new BillQueueManager();
    static AccountRequestManager requestManager = new AccountRequestManager();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        // Task 6 - Array demo
        System.out.println(" Task 6 - Physical Data Structure (Array) ");
        BankSystem bankSystem = new BankSystem();
        bankSystem.run();

        boolean running = true;
        while (running) {
            System.out.println("\n               ");
            System.out.println("1 - Enter Bank");
            System.out.println("2 - Enter ATM");
            System.out.println("3 - Admin Area");
            System.out.println("4 - Exit");
            System.out.print("Choose: ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1": bankMenu(); break;
                case "2": atmMenu(); break;
                case "3": adminMenu(); break;
                case "4":
                    running = false;
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid option!");
            }
        }
    }

    static void bankMenu() {
        boolean back = false;
        while (!back) {
            System.out.println("\n    BANK MENU    ");
            System.out.println("1 - Submit account opening request");
            System.out.println("2 - Deposit money");
            System.out.println("3 - Withdraw money");
            System.out.println("4 - View all accounts");
            System.out.println("5 - Add bill payment");
            System.out.println("6 - Back");
            System.out.print("Choose: ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    System.out.print("Enter account number: ");
                    String num = scanner.nextLine();
                    System.out.print("Enter username: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter initial balance: ");
                    double bal = Double.parseDouble(scanner.nextLine());
                    requestManager.addRequest(new BankAccount(num, name, bal));
                    break;
                case "2":
                    System.out.print("Enter username: ");
                    String dUser = scanner.nextLine();
                    System.out.print("Enter deposit amount: ");
                    double dAmount = Double.parseDouble(scanner.nextLine());
                    manager.deposit(dUser, dAmount);
                    transactionManager.addTransaction("Deposit " + (int) dAmount + " to " + dUser);
                    break;
                case "3":
                    System.out.print("Enter username: ");
                    String wUser = scanner.nextLine();
                    System.out.print("Enter withdraw amount: ");
                    double wAmount = Double.parseDouble(scanner.nextLine());
                    manager.withdraw(wUser, wAmount);
                    transactionManager.addTransaction("Withdraw " + (int) wAmount + " from " + wUser);
                    break;
                case "4":
                    manager.displayAll();
                    break;
                case "5":
                    System.out.print("Enter bill name: ");
                    String bill = scanner.nextLine();
                    billQueueManager.addBill(bill);
                    break;
                case "6":
                    back = true;
                    break;
                default:
                    System.out.println("Invalid option!");
            }
        }
    }

    static void atmMenu() {
        boolean back = false;
        while (!back) {
            System.out.println("\n    ATM MENU    ");
            System.out.println("1 - Balance enquiry");
            System.out.println("2 - Withdraw");
            System.out.println("3 - Back");
            System.out.print("Choose: ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    System.out.print("Enter username: ");
                    String uname = scanner.nextLine();
                    BankAccount acc = manager.searchByUsername(uname);
                    if (acc != null) {
                        System.out.println("Balance: " + (int) acc.balance);
                    }
                    break;
                case "2":
                    System.out.print("Enter username: ");
                    String wUser = scanner.nextLine();
                    System.out.print("Enter withdraw amount: ");
                    double wAmount = Double.parseDouble(scanner.nextLine());
                    manager.withdraw(wUser, wAmount);
                    transactionManager.addTransaction("ATM Withdraw " + (int) wAmount + " from " + wUser);
                    break;
                case "3":
                    back = true;
                    break;
                default:
                    System.out.println("Invalid option!");
            }
        }
    }

    static void adminMenu() {
        boolean back = false;
        while (!back) {
            System.out.println("\n    ADMIN MENU    ");
            System.out.println("1 - View pending account requests");
            System.out.println("2 - Process next account request");
            System.out.println("3 - View bill queue");
            System.out.println("4 - Process next bill");
            System.out.println("5 - View transaction history");
            System.out.println("6 - Undo last transaction");
            System.out.println("7 - Back");
            System.out.print("Choose: ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1": requestManager.displayPending(); break;
                case "2": requestManager.processRequest(manager); break;
                case "3": billQueueManager.displayQueue(); break;
                case "4": billQueueManager.processNextBill(); break;
                case "5": transactionManager.displayAll(); break;
                case "6": transactionManager.undoLastTransaction(); break;
                case "7": back = true; break;
                default: System.out.println("Invalid option!");
            }
        }
    }
}