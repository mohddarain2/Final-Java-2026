import java.util.Scanner;

public class Array_2d_user_input {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = sc.nextInt();

        // int arr[][] = new int[rows][cols];
        String arr[][]= new String[rows][cols];
        System.out.println("Enter the elements of 2D array: ");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                // arr[i][j] = sc.nextInt();
                // arr[i][j] = sc.next();
                arr[i][j] = sc.nextLine();
            }
        }

        System.out.println("2D Array elements are: ");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
