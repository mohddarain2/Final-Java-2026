public class Nested_if_else {
    public static void main(String[] args) {
        int number = 0; // You can change this value to test different conditions

        // Nested If-Else Statement
        if (number >= 0) {
            if (number == 0) {
                System.out.println("The number is zero.");
            } else {
                System.out.println("The number is positive.");
            }
        } else {
            System.out.println("The number is negative.");
        }
    }
}
