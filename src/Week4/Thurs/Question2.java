package Week4.Thurs;


import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        System.out.print("Enter months of membership: ");
        int months = sc.nextInt();

        boolean getsDiscount = (age >= 18 && age <= 25) && (months > 6);

        System.out.println("Discount: " + getsDiscount);

        sc.close();
    }
}
