package Week7.Thurs;

import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[5];
        int sum = 0;

        // Input numbers into the array
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
            sum += numbers[i]; // Calculate sum while inputting
        }

        // Calculate average
        double average = (double) sum / numbers.length;

        // Print results
        System.out.println("\nTotal number of elements: " + numbers.length);
        System.out.println("Sum of all elements: " + sum);
        System.out.println("Average of all elements: " + average);

        sc.close();


    }
}
