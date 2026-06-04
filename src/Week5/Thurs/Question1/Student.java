package Week5.Thurs.Question1;

public class Student {
    String name;
    int age;
    String grade;

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
    }

    void greet() {
        System.out.println("Welcome to school, " + name + "!");
    }

}
