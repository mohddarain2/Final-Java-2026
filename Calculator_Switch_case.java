import java.util.Scanner;

public class Calculator_Switch_case {
    public static void main(String[] args) {
        String choice;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter first number: ");
            int num1 = sc.nextInt();

            System.out.println("Enter second number: ");
            int num2 = sc.nextInt();

            System.out.println("Enter the operation (+, -, *, /, %): ");
            String operation = sc.next();

            int result;
            switch (operation) {
                case "+":
                    result = num1 + num2;
                    System.out.println("Result: " + result);
                    break;
                case "-":
                    result = num1 - num2;
                    System.out.println("Result: " + result);
                    break;
                case "*":
                    result = num1 * num2;
                    System.out.println("Result: " + result);
                    break;
                case "/":
                    if (num2 != 0) {
                        result = num1 / num2;
                        System.out.println("Result: " + result);
                    } else {
                        System.out.println("Error: Division by zero is not allowed.");
                    }
                    break;
                case "%":
                    result = num1 % num2;
                    System.out.println("Result: " + result);
                    break;
                default:
                    System.out.println("Invalid operation.");
                    break;
            }
            System.out.println("Do you want to perform another calculation? (yes/no)");
            choice = sc.next();
            sc.close();
        } while (choice.equalsIgnoreCase("yes"));
    }
}
