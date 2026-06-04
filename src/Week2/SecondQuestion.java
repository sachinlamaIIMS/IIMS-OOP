package Week2;

public class SecondQuestion {

    public static void main(String[] args) {

        String name = "Aarav Sharma";

        // Primitive types
        int age = 28;
        double height = 172.5;
        boolean isPaid = true;
        char permitCode = 'E';
        int feeNPR = 35000;


        double feeMYR = feeNPR * 0.033; // Implicit (widening) conversion: long → double
        System.out.println("=== Tourist Permit Details ===");
        System.out.println("Name:         " + name);
        System.out.println("Age:          " + age);
        System.out.println("Height (cm):  " + height);
        System.out.println("Permit paid:  " + isPaid);
        System.out.println("Permit code:  " + permitCode);
        System.out.println("Fee (NPR):    " + feeNPR);
        System.out.println("Fee (MYR):    " + feeMYR);
        System.out.println("==============================");

    }
}
