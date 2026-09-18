import java.util.Scanner;

public class Conditions_with_userInput {
    public static void main ( String[] args){
        Scanner sc = new Scanner(System.in);

        // If-Else Statement with User Input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        if(number>0){
            System.out.println("The number is positive.");
        }else if(number<0){
            System.out.println("The number is negative.");
        }else{
            System.out.println("The number is zero.");
        }

        // Switch Statement with User Input
        System.out.print("Enter a day number (1-7): ");
        int day = sc.nextInt();
        switch(day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day");  
        }
    }
}
