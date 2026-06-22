package Week6.Thurs.Question1;

public class Student {
    String name;
    static int totalStudents = 0;

    public void register() {
        totalStudents++;
        System.out.println(name + " registered.");
    }
}
