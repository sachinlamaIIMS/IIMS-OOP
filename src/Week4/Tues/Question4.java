package Week4.Tues;

public class Question4 {
    public static void main(String[] args) {
        double orderTotal = 650;
        int distanceKm = 12;
        boolean isPremium = true;

        boolean feeApplies = orderTotal < 500 || distanceKm > 10;
        boolean discountApplies = orderTotal > 800 && isPremium;

        double fee = feeApplies ? 60 : 0;       // acceptable since ternary is an operator
        double discount = discountApplies ? 100 : 0;

        double finalAmount = orderTotal + fee - discount;

        System.out.println("Delivery fee applies: " + feeApplies);
        System.out.println("Discount applies: " + discountApplies);
        System.out.println("Final amount: Rs. " + finalAmount);
    }
}
