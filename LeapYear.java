import java.util.Scanner;

public class LeapYear {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the year: ");
    int year = sc.nextInt();
    // if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
    // System.out.println(year + " is a leap year.");
    // } else {
    // System.out.println(year + " is not a leap year.");
    // }

    if (year % 4 == 0) { // 2000 % 4 ==0
                if (year % 100 == 0) { // 2000 % 100 ==0
                                      if (year % 400 == 0) { // 2000 % 400 ==0
                                        System.out.println("leap year");
                                      } else {
                                        System.out.println("not leap year");
                                      }
                } else {
                  System.out.println(" leap year");
                }
    } else {
      System.out.println(" not leap year");
    }

  }
}
