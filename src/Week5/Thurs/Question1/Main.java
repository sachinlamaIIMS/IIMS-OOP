package Week5.Thurs.Question1;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Alice";
        s1.age = 14;
        s1.grade = "8A";
        s1.displayInfo();
        s1.greet();

        System.out.println();

        Student s2 = new Student();
        s2.name = "Ben";
        s2.age = 15;
        s2.grade = "9B";
        s2.displayInfo();
        s2.greet();
    }

}


