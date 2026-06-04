package Week2;

public class TypeCasting {
    static void main() {
        //example of implicit and explicit type casting
        int num1 = 100;
        double num2 = num1; // implicit type casting (widening)
        System.out.println("Implicitly casted int to double: " + num2);

        double num3 = 99.99;
        int num4 = (int) num3; // explicit type casting (narrowing)
        System.out.println("Explicitly casted double to int: " + num4);

        long num = 100L;
        char letter = (char) num;
        System.out.println("Explicitly casted int to char: " + letter);



    }
}
