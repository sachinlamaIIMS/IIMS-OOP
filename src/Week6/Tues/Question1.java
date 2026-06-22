package Week6.Tues;

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many slices are left? ");
        int slices = sc.nextInt();

        for (int i = slices; i >= 1; i--) {
            System.out.println("Slice " + i + " is gone!");
        }
        System.out.println("All pizza has been eaten. 🍕");
    }
}
