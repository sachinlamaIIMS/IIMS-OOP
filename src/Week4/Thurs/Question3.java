package Week4.Thurs;

import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = sc.nextDouble();

        double celsius = (fahrenheit - 32) * 5 / 9;
        boolean bringJacket = celsius < 15;

        System.out.println("Temperature in Celsius: " + celsius);
        System.out.println("Bring a jacket: " + bringJacket);

        sc.close();
    }
}