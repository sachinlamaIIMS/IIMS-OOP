package Week4.Tues;

public class Question2 {
    public static void main(String[] args) {
        int attendance = 80;
        int assignmentScore = 47;
        boolean outstandingFees = false;

        boolean attendanceOK = attendance >= 75;
        boolean assignmentOK = assignmentScore > 50;
        boolean noFees = !outstandingFees;
        boolean eligible = attendanceOK && assignmentOK && noFees;


        System.out.println("Attendance OK: " + attendanceOK);
        System.out.println("Assignment OK: " + assignmentOK);
        System.out.println("No outstanding fees: " + noFees);
        System.out.println("Eligible for exam: " + eligible);
    }
}