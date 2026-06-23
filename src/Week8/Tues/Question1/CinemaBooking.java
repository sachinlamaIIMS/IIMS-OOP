package Week8.Tues.Question1;

public class CinemaBooking {
    public static void main(String[] args) {
        Ticket t1 = new Ticket();
        t1.movieName = "Avengers";
        t1.seatType = "Premium";
        t1.basePrice = 200.0;
        t1.bookTicket();

        Ticket t2 = new Ticket();
        t2.movieName = "Inside Out 2";
        t2.seatType = "Regular";
        t2.basePrice = 150.0;
        t2.bookTicket();

        System.out.println("Total tickets sold so far: " + Ticket.totalTicketsSold);
    }
}
