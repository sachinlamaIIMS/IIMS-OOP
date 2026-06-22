package Week6.Tues;

import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int secret = 7;
        int guess;
        int tries = 0;

        do {
            System.out.print("Guess the number (1-10): ");
            guess = sc.nextInt();
            tries++;

            if (guess < secret) {
                System.out.println("Too low!");
            } else if (guess > secret) {
                System.out.println("Too high!");
            }
        } while (guess != secret);

        System.out.println("🎉 Correct! You got it in " + tries + " tries!");
    }
}
