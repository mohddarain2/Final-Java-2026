import java.util.Scanner;

class Whileloop {
    public static void main(String[] args) {
        // int item=0;
        // while(item<=10){ // 0 0<=10 | 1 1<=10 | 2 2<=10 | 3 3<=10 | 4 4<=10 | 5 5<=10
        // | 6 6<=10 | 7 7<=10 | 8 8<=10 | 9 9<=10 | 10 10<=10 | 11 11<=10 false
        // System.out.println(item); // 0 1 2 3 4 5 6 7 8 9 10
        // item++;

        // }

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        int item = 1;
        while (item < num) {
            if (item % 2 == 1) {
                System.out.println(item);
            }
            item++;
        }
        sc.close();
        System.out.println("The loop is completed " + item);
    }
}