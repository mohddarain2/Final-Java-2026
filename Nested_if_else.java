import java.util.Scanner;
public class Nested_if_else {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt(); // Read input from the user

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
