package Week3;

public class UnaryOperators {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        // Using unary plus
        int c = +a; // c becomes 5
        System.out.println("Unary plus on a: " + c); // 5

        // Using unary minus
        int d = -b; // d becomes -10
        System.out.println("Unary minus on b: " + d); // -10

        // Using increment operator (postfix)
        int e = a++; // e becomes 5, then a becomes 6
        System.out.println("Postfix increment on a: " + e); // 5
        System.out.println("Value of a after postfix increment: " + a); // 6

        // Using increment operator (prefix)
        int f = ++b; // b becomes 11, then f becomes 11
        System.out.println("Prefix increment on b: " + f); // 11
        System.out.println("Value of b after prefix increment: " + b); // 11

    }
}
