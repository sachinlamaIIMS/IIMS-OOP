package Week7.Thurs;
import java.util.Scanner;

public class ArrayInputPractice {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] marks = new int[5];
        int total = 0;

        // Take input and store in array
        for (int i = 0; i < marks.length; i++) {
            System.out.print("Enter mark " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
        }

        // Display all marks and calculate total
        System.out.println("\nMarks entered:");
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
            total += marks[i];
        }

        // Calculate average
        double average = (double) total / marks.length;

        System.out.println("\nTotal = " + total);
        System.out.println("Average = " + average);

        sc.close();
    }
}
