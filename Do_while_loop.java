import java.util.Scanner;

public class Do_while_loop {
    public static void main(String[] args) {
        // int item = 0;
        // do {
        // item++;
        // System.out.println(item);
        // } while (item <= 10);
        // -------------------------------------------------------------------------
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the number: ");
        // int num = sc.nextInt();
        // int item = 0;
        // do {
        // System.out.println(item);
        // item++;
        // } while (item <= num);
        // sc.close();

        // -------------------------------------------------------------------------
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt(); //10
        // int item = 0;
        do {
            if (num % 2 == 0) {
                System.out.println(num); // 10 8 6 4 2
            }
            num--; // 9 8 7 6 5 4 3 2 1 0
        } while (num>=0);
        
        sc.close();

    }
}
