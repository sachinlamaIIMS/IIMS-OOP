package Week4.Tues;

public class Question1 {
    public static void main(String[] args) {
        int students = 32;
        int pizzas = 5;
        int slicesPerPizza = 8;
        int pricePerSlice = 120;

        int totalSlices = pizzas * slicesPerPizza;
        int slicesPerStudent = totalSlices / students;
        int leftover = totalSlices % students;
        int totalCost = totalSlices * pricePerSlice;

        System.out.println("Total slices: " + totalSlices);
        System.out.println("Each student gets: " + slicesPerStudent + " slice(s)");
        System.out.println("Leftover slices: " + leftover);
        System.out.println("Total cost: Rs. " + totalCost);
    }
}