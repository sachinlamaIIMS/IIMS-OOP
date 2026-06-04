package Week3;

public class ArithmeticOperators {

    public static void main(String[] args) {
        //example of arithmetic operators
        int a = 15;
        int b = 5;

        System.out.println("a + b = " + a + b); // addition
        System.out.println("a - b = " + (a - b)); // subtraction
        System.out.println("a * b = " + (a * b)); // multiplication
        System.out.println("a / b = " + (a / b)); // division
        System.out.println("a % b = " + (a % b)); // modulus (remainder)

        //important things to remember

        //0. string concatenation: When using the + operator with strings, it concatenates them instead of performing addition\
        //whereas with String and numbers it will convert the number to a string and concatenate it
        //eg:
        String str1 = "Hello, ";
        String str2 = "world!";
        System.out.println(str1 + str2); // This will output "Hello, world!"

        //eg: (String and numbers)
        int num = 10;
        int num2 = 20;
        String strNum = "The number is: ";
        System.out.println(strNum+num2 + num); // outputs "The number is: 2010" because num2 is concatenated first, then num is concatenated to the result



        //1. Division of two integers results in an integer (fractional part is discarded)
        //eg:
        int x = 7;
        int y = 2;
        System.out.println("x / y = " + x / y);
        System.out.println(7.0/2); // This will give a floating-point result because 7.0 is a double literal


        //3. Be careful with division by zero, it will throw an ArithmeticException
        //eg:
        int m = 10;
        int n = 0;
//      System.out.println("m / n = " + (m / n)); // This will throw an exception, so it's commented out to prevent runtime error
        System.out.println(10.0/0); // This will give Infinity, not an exception, because 10.0 is a double literal


        //5. Operator precedence: Multiplication and division are evaluated before addition and subtraction
        //eg:
        int result = a + b * 2; // This will be evaluated as a + (b * 2) due to operator precedence
        System.out.println("a + b * 2 = " + result); // This will output ,

        //6. Parentheses can be used to change the order of evaluation
        int resultWithParentheses = (a + b) * 2; // This will
        System.out.println("(a + b) * 2 = " + resultWithParentheses); // This will output 30
        System.out.println(a/b*2);



    }
}
