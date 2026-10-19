public class Swap_without_third_varible {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.println("Before swapping: a = " + a + ", b = " + b);

        // Swapping without using a temporary variable
        a = a + b; // a now becomes 30
        b = a - b; // b becomes 10 (30 - 20)
        a = a - b; // a becomes 20 (30 - 10)

        System.out.println("After swapping: a = " + a + ", b = " + b);
    }
}
