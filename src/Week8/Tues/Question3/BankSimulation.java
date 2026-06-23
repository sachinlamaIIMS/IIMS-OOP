package Week8.Tues.Question3;

public class BankSimulation {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount();
        acc1.openAccount("Priya", 1000.0);

        double[] transactions = {500.0, -200.0, -2000.0, 300.0};
        acc1.processTransactions(transactions);

        System.out.println("Total accounts opened at " + BankAccount.bankName + ": " + BankAccount.totalAccountsOpened);
    }
}
