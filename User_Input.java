import java.util.Scanner;
public class User_Input{
    public static void main(String[] args){
        System.out.println("Enter your name: ");

        Scanner sc = new Scanner (System.in);
        String name = sc.nextLine();
        
        System.out.println("Enter your age: ");
        int  age = sc.nextInt();
        
        
        System.out.println("Your salary is: " );
        // float salary = 2200f;
        float salary = sc.nextFloat();


        System.out.println("Hello, " + name + "!");
        System.out.println("You are " + age + " years old.");
        System.out.println("Your salary is: " + salary);    
        sc.close();

        
    }
}