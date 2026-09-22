import java.util.Scanner;

class Whileloop {
    public static void main(String[] args) {
        // int item=0;
        // while(item<=10){ // 0 0<=10 | 1 1<=10 | 2 2<=10 | 3 3<=10 | 4 4<=10 | 5 5<=10
        // | 6 6<=10 | 7 7<=10 | 8 8<=10 | 9 9<=10 | 10 10<=10 | 11 11<=10 false
        // System.out.println(item); // 0 1 2 3 4 5 6 7 8 9 10
        // item++;

        // }

        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the number: ");
        // int num = sc.nextInt();
        // int item = 1;
        // while (item < num) {
        //     if (item % 2 == 1) {
        //         System.out.println(item);
        //     }
        //     item++;
        // }
        // sc.close();
        // System.out.println("The loop is completed " + item);

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        int item = 0;
        while (item<=num) { // 10 10>0 | 9 9>0 | 8 8>0 | 7 7>0 | 6 6>0 | 5 5>0 | 4 4>0 | 3 3>0 | 2 2>0 | 1 1>0 | 0 0>0 false
            System.out.println(num); // 10 9 8 7 6 5 4 3 2 1
            num--;
        }
        System.out.println("The loop is completed " + num);
        sc.close();
    }
}