package Week5.Sun;

public class JavaMethods {
    //simple examples of methods in java
    public static void greet() {
        System.out.println("Hello, welcome to Java methods!");
    }

    //example using parameters
    public static void greetPerson(String name) {
        System.out.println("Hello, " + name + "! Welcome to Java methods!");
    }

    //example using return type
    public static int addTwoNumbers(int a, int b) {
        return a+b;
    }

    public static void main(String[] args) {
        greet(); // Call the greet method
        greet(); // can call the greet method multiple times

        greetPerson("Sachin"); // Call the greetPerson method with a name
        int sum = addTwoNumbers(5, 10); // Call the add method and store the result
        System.out.println(sum );
    }
}
