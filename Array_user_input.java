import java.util.Scanner;

public class Array_user_input {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int Size = sc.nextInt();
        // System.out.print("Array elements are: " + Size);

        int arr[] = new int[Size];
        System.out.println("Enter the elements of array: ");
        for(int i=0;i<Size;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Array elements are here: ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
