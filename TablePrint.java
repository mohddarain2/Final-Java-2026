import java.util.Scanner;
public class TablePrint {
    public static void main(String[] args) {
        // int number = 5; // Change this to the desired number
        // System.out.println("Multiplication Table of " + number);
        // for (int i = 1; i <= 10; i++) {
        //     System.out.println(number + " x " + i + " = " + (number * i));
        // }
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int number = sc.nextInt();
        System.out.println("Multiplication Table of " + number);
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }
}
