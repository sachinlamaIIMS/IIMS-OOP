package Week5.Thurs;

public class ClassObjectExample {

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Alice";
        s1.age = 14;
        s1.grade = "8A";
        s1.displayInfo();
        s1.greet();
    }
}

class Student {
    String name;
    int age;
    String grade;

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
    }

    void greet() {
        System.out.println("Hello, my name is " + name + " and I am in grade " + grade + ".");
    }
}




