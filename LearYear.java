import java.util.Scanner;

public class LearYear {
    public static void main(String[] args) {

        // 1. Leap year condition

        // It is divisible by 400, OR

        // It is divisible by 4 but not divisible by 100.

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year: ");
        int year = sc.nextInt();
        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
        sc.close();
    }
}
