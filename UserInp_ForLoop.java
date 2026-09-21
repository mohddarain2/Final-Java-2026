import java.util.Scanner;
public class UserInp_ForLoop {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number row");
        int num1 = sc.nextInt();
        System.out.println("Enter the number of columns");
        int num2 = sc.nextInt();

        for(int i=0;i<=num1;i++){ // 0 0<=3 | 1 1<=3 | 2 2<=3 | 3 3<=3 | 4 4<=3 false
            
            for(int j=0;j<num2;j++){ // 0 0<4 | 1 1<4 | 2 2<4 | 3 3<4 | 4 4<4 false
                System.out.print(j+" "); // 0 1 2 3 | 0 1 2 3 | 0 1 2 3 | 0 1 2 3
            }
            System.out.println();

        }
    }
}
