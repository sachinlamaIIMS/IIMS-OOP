package Week4.Thurs;

import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your total XP: ");
        int totalXP = sc.nextInt();

        int xpPerLevel = 500;
        int level = totalXP / xpPerLevel;
        int xpUsed = level * xpPerLevel;
        int xpInCurrentLevel = totalXP % xpPerLevel;

        int xpNeeded = xpPerLevel;
        xpNeeded -= xpInCurrentLevel;

        System.out.println("Current level: " + level);
        System.out.println("XP used in completed levels: " + xpUsed);
        System.out.println("XP into current level: " + xpInCurrentLevel);
        System.out.println("XP needed to level up: " + xpNeeded);

        sc.close();
    }
}
