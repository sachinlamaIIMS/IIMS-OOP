package Week4.Tues;

public class LogicalOperators {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        // Logical AND (&&)
        System.out.println("a > 5 && b < 30: " + (a > 5 && b < 30)); // true
        System.out.println("a > 15 && b < 30: " + (a > 15 && b < 30)); // false

        // Logical OR (||)
        System.out.println("a > 5 || b < 30: " + (a > 5 || b < 30)); // true
        System.out.println("a > 15 || b < 30: " + (a > 15 || b < 30)); // true

        // Logical NOT (!)
        System.out.println("!(a > 5): " + !(a > 5)); // false
        System.out.println("!(b < 30): " + !(b < 30)); // false

        //person needs to be be above 18 yeras old and have club ticket to enter the club
        int age = 25;
        boolean hasTicket = true;

        boolean canEnterClub = (age > 18) && hasTicket;
        System.out.println("Can enter club: " + canEnterClub); // true
    }
}
