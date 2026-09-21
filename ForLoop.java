public class ForLoop {
    public static void main(String[] args) {

        // System.out.println("Print the numbers from 1 to 10");
        // for(int i=0;i<=5;i++){
        // System.out.println(i);
        // }

        System.out.println("Print the numbers from 10 to 1");
        for(int i=5;i>=0;i--){ 
        System.out.println(i); 
        }

        System.out.println("Print the square of numbers from 10 to 1");
        for (int i = 5; i >= 0; i--) {
            System.out.println(i * i);
        }

        System.out.println("Print the odd numbers from 1 to 10");
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 1) {
                System.out.println(i);
            }
        }

        System.out.println("Print the Even numbers from 1 to 7");
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        System.out.println("Print the table of 5");
    }
}
