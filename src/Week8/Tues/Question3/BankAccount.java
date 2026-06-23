package Week8.Tues.Question3;

class BankAccount {
    String accountHolder;
    double balance;

    static String bankName = "Nepal Community Bank";
    static int totalAccountsOpened = 0;

    void openAccount(String name, double initialDeposit) {
        accountHolder = name;
        balance = initialDeposit;
        totalAccountsOpened++;
        System.out.println("Welcome to " + bankName + ", " + accountHolder + "!");
        System.out.println("Initial Balance: Rs. " + balance);
    }

    void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Deposited Rs. " + amount + " | New Balance: Rs. " + balance);
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Withdrew Rs. " + amount + " | New Balance: Rs. " + balance);
        } else {
            System.out.println("Withdrawal of Rs. " + amount + " failed: Insufficient balance");
        }
    }

    void processTransactions(double[] transactions) {
        for (int i = 0; i < transactions.length; i++) {
            if (transactions[i] >= 0) {
                deposit(transactions[i]);
            } else {
                withdraw(-transactions[i]);
            }
        }
        System.out.println("Final Balance for " + accountHolder + ": Rs. " + balance);
    }
}


