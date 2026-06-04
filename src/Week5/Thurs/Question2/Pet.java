package Week5.Thurs.Question2;

public class Pet {
    String name;
    String type;
    int age;

    void displayInfo() {
        System.out.println("Name: " + name + "  |  Type: " + type + "  |  Age: " + age);
    }

    void needsVaccine() {
        if (age < 2) {
            System.out.println(name + " needs a vaccine!");
        } else {
            System.out.println(name + " is up to date.");
        }
    }
}
