package Week5.Tues;

import java.util.Scanner;

public class Question2 {

    static String getCategory(int age) {
        if (age < 5) {
            return "Free";
        } else if (age <= 12) {
            return "Child";
        } else if (age <= 17) {
            return "Teen";
        } else {
            return "Adult";
        }
    }

    static double getPrice(int age) {
        if (age < 5) {
            return 0.0;
        } else if (age <= 12) {
            return 8.0;
        } else if (age <= 17) {
            return 12.0;
        } else {
            return 20.0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter visitor name: ");
        String name = sc.nextLine();

        System.out.print("Enter visitor age: ");
        int age = sc.nextInt();

        String category = getCategory(age);
        double price = getPrice(age);

        System.out.println("\nWelcome, " + name + "!");
        System.out.println("Category: " + category);

        if (price == 0.0) {
            System.out.println("You're our guest! Enjoy the park!");
        } else {
            System.out.println("Your ticket price: $" + price);
        }
    }
}