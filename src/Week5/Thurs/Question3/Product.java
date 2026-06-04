package Week5.Thurs.Question3;

public class Product {
    String name;
    double price;
    int quantity;
    String category;

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Price: $" + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Category: " + category);
    }

    void applyDiscount(double percent) {
        price = price - (price * percent / 100);
        System.out.printf("Discount applied! New price: $%.2f%n", price);
    }

    void isInStock() {
        if (quantity > 0) {
            System.out.println(name + " is in stock.");
        } else {
            System.out.println(name + " is out of stock.");
        }
    }
}
