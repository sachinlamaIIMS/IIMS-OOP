package Week3;

public class QuickBiteKTM {
    public static void main(String[] args) {

        // Order 1
        String customer1 = "Aayush";
        String location1 = "Thamel";
        String foodItem1 = "Momo";
        int quantity1 = 2;
        double price1 = 150.0;
        boolean isDelivered1 = true;
        double total1 = quantity1 * price1;

        // Order 2
        String customer2 = "Sita";
        String location2 = "Baneshwor";
        String foodItem2 = "Chowmein";
        int quantity2 = 1;
        double price2 = 180.0;
        boolean isDelivered2 = false;
        double total2 = quantity2 * price2;

        // Order 3
        String customer3 = "Ramesh";
        String location3 = "Lalitpur";
        String foodItem3 = "Burger";
        int quantity3 = 3;
        double price3 = 220.0;
        boolean isDelivered3 = false;
        double total3 = quantity3 * price3;

        // Print Order Slips
        System.out.println("===== QUICKBITE KTM - ORDER SLIP =====");

        System.out.println("Customer: " + customer1);
        System.out.println("Location: " + location1);
        System.out.println("Food Item: " + foodItem1);
        System.out.println("Quantity: " + quantity1);
        System.out.println("Price: " + price1);
        System.out.println("Total: " + total1);
        System.out.println("Delivered: " + isDelivered1);
        System.out.println("--------------------------------");

        System.out.println("Customer: " + customer2);
        System.out.println("Location: " + location2);
        System.out.println("Food Item: " + foodItem2);
        System.out.println("Quantity: " + quantity2);
        System.out.println("Price: " + price2);
        System.out.println("Total: " + total2);
        System.out.println("Delivered: " + isDelivered2);
        System.out.println("--------------------------------");

        System.out.println("Customer: " + customer3);
        System.out.println("Location: " + location3);
        System.out.println("Food Item: " + foodItem3);
        System.out.println("Quantity: " + quantity3);
        System.out.println("Price: " + price3);
        System.out.println("Total: " + total3);
        System.out.println("Delivered: " + isDelivered3);
        System.out.println("--------------------------------");
    }
}