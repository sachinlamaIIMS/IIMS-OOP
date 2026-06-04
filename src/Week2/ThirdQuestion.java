package Week2;

public class ThirdQuestion {
    public static void main(String[] args) {

        int    ticketsSold = 47;
        double price       = 350.75;

        // int * double → Java widens int to double automatically (implicit)
        double total = ticketsSold * price;  // 16485.25

        // double → int: NARROWING (explicit cast required)
        // fractional part .25 is dropped
        int totalWhole = (int) total;          // 16485

        System.out.println("Exact total:  NPR " + total);
        System.out.println("Cash register: NPR " + totalWhole);
    }
}
