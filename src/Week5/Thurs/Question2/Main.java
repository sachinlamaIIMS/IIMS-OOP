package Week5.Thurs.Question2;

public class Main {
    public static void main(String[] args) {
        Pet p1 = new Pet();
        p1.name = "Milo";
        p1.type = "Dog";
        p1.age = 1;
        p1.displayInfo();
        p1.needsVaccine();

        System.out.println();

        Pet p2 = new Pet();
        p2.name = "Luna";
        p2.type = "Cat";
        p2.age = 3;
        p2.displayInfo();
        p2.needsVaccine();

        System.out.println();

        Pet p3 = new Pet();
        p3.name = "Kiwi";
        p3.type = "Rabbit";
        p3.age = 1;
        p3.displayInfo();
        p3.needsVaccine();
    }
}
