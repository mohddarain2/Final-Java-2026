// public class Even_and_Odd {
//     public static void main(String[] args) {
//         int number = 10;
//         if (number % 2 == 0) {
//             System.out.println(number + " is even.");
//         } else {
//             System.out.println(number + " is odd.");
//         }
//     }
// }
import java.util.Scanner;
class Even_and_Odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int number = sc.nextInt();
        if (number % 2 == 0) {
            System.out.println(number + " is even.");
        } else {
            System.out.println(number + " is odd.");
        }
    }
}