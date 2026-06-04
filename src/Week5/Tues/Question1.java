package Week5.Tues;

import java.util.Scanner;

public class Question1 {

    static double calculateTotal(double item1, double item2) {
        return item1 + item2;
    }

    static double addServiceCharge(double total) {
        return total + (total * 0.10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter coffee price: ");
        double coffee = sc.nextDouble();

        System.out.print("Enter snack price: ");
        double snack = sc.nextDouble();

        double subtotal = calculateTotal(coffee, snack);
        double finalTotal = addServiceCharge(subtotal);
        double charge = finalTotal - subtotal;

        System.out.println("\n===== JavaBrew Café Receipt =====");
        System.out.println("Coffee:        $" + coffee);
        System.out.println("Snack:         $" + snack);
        System.out.println("Subtotal:      $" + subtotal);
        System.out.println("Service (10%): $" + charge);
        System.out.println("Total:         $" + finalTotal);
        System.out.println("================================");
    }
}