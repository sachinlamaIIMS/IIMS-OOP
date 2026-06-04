package Week4.Thurs;

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter total bill amount: ");
        int bill = sc.nextInt();

        System.out.print("Enter number of people: ");
        int people = sc.nextInt();

        int share = bill / people;
        int remainder = bill % people;

        System.out.println("Each person pays: " + share);
        System.out.println("Splits evenly: " + (remainder == 0));

        sc.close();
    }
}