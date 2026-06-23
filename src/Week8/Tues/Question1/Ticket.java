package Week8.Tues.Question1;

class Ticket {
    String movieName;
    String seatType;
    double basePrice;

    static int totalTicketsSold = 0;

    double calculatePrice() {
        double finalPrice;
        if (seatType.equals("Premium")) {
            finalPrice = basePrice * 1.5;
        } else {
            finalPrice = basePrice;
        }
        return finalPrice;
    }

    void bookTicket() {
        totalTicketsSold++;
        System.out.println("Ticket booked for: " + movieName);
        System.out.println("Seat Type: " + seatType);
        System.out.println("Price to pay: Rs. " + calculatePrice());
    }
}


