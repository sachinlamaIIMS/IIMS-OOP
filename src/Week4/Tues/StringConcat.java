package Week4.Tues;

//String Concatenation with Strings and numbers
public class StringConcat {
        public static void main(String[] args) {

            //String Concatenation
            String str1 = "Hello";
            String str2 = "World";

            String result1 = str1 + str2;
            System.out.println(result1);

            //String + number  = String concatenation
            System.out.println("Age: " + 30);

            int a = 5;
            System.out.println(a+a+"1");
            System.out.println(a+"1"+a);
            System.out.println("1"+(a+a));

        }
}
