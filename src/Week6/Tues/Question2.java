package Week6.Tues;

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String password = "";

        while (!password.equals("java123")) {
            System.out.print("Enter the password: ");
            password = sc.nextLine();
            if (!password.equals("java123")) {
                System.out.println("Wrong password! Try again.");
            }
        }
        System.out.println("Access granted! Welcome in! 🔓");
    }
}