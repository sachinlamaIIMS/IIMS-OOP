package Week7.Thurs;

import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = 0;
        double[] marks = new double[5];
        for (int i = 0; i< marks.length; i++){
            System.out.println("Enter Grade "+ (i+1)+ " :");
            marks[i] = sc.nextDouble();

            if (marks[i] <0 || marks[i]>100){
                System.out.println("Invalid mark, please enter a mark between 0 and 100");
                i--;
            }
        }
        System.out.println("\n--- Grade Report ---");
        for(double mark: marks){
            System.out.println(mark);
            total += mark;
        }

        double avg = total/marks.length;
        System.out.println("Class Average: " + avg);
    }
}

