package Week3;

public class IIMSFestivalBudget {
    public static void main(String[] args) {

        // Event Details
        String eventName = "Annual Tech Fest";
        String organizerName = "Data Science Club";
        int studentsAttending = 250;
        double budgetAllocated = 50000.0;
        double foodExpense = 20000.0;
        double decorationExpense = 15000.0;

        // Calculate total expense
        double totalExpense = foodExpense + decorationExpense;

        // Manually assign based on logic: budget >= totalExpense
        boolean isBudgetSufficient = true; // 50000 >= 35000

        // Print Budget Report
        System.out.println("===== IIMS FESTIVAL BUDGET REPORT =====");
        System.out.println("Event: " + eventName);
        System.out.println("Organizer: " + organizerName);
        System.out.println("Students: " + studentsAttending);
        System.out.println("Budget: " + budgetAllocated);
        System.out.println("Food Expense: " + foodExpense);
        System.out.println("Decoration Expense: " + decorationExpense);
        System.out.println("Total Expense: " + totalExpense);
        System.out.println("Budget Sufficient: " + isBudgetSufficient);
        System.out.println("--------------------------------");
    }
}