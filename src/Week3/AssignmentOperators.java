package Week3;

public class AssignmentOperators {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        // Using assignment operator
        a += b; // a = a + b → a becomes 15
        System.out.println("After a += b: " + a); // 15

        a -= b; // a = a - b → a becomes 10
        System.out.println("After a -= b: " + a); // 10

        a *= b; // a = a * b → a becomes 50
        System.out.println("After a *= b: " + a); // 50

        a /= b; // a = a / b → a becomes 10
        System.out.println("After a /= b: " + a); // 10

        a %= b; // a = a % b → a becomes 0 (remainder of 10/5)
        System.out.println("After a %= b: " + a); // 0

    }
}
