package Week5.Thurs.Question3;

public class Main {

    public static void main(String[] args) {
        Product p1 = new Product();
        p1.name = "Headphones";
        p1.price = 49.99;
        p1.quantity = 10;
        p1.category = "Electronics";
        p1.displayInfo();
        p1.isInStock();
        p1.applyDiscount(20);

        System.out.println();

        Product p2 = new Product();
        p2.name = "Notebook";
        p2.price = 5.00;
        p2.quantity = 0;
        p2.category = "Stationery";
        p2.displayInfo();
        p2.isInStock();
    }
}
