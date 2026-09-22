public class Break_and_Continue {
    public static void main(String[] args) {
        System.out.println("Print the numbers from 1 to 10");
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                break;
            }
            System.out.println(i);
        }

        System.out.println("Print the numbers from 1 to 10 except 5");
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                continue;
            }
            System.out.println(i);
        }
    }
}
