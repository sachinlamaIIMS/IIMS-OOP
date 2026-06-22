package Week6.Thurs.Question1;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Ali";

        Student s2 = new Student();
        s2.name = "Sara";

        Student s3 = new Student();
        s3.name = "Omar";

        s1.register();
        s2.register();
        s3.register();

        System.out.println("Total students: " + Student.totalStudents);
    }
}