public class Unary_Operator {
    public static void main(String[] args) {
        int a = 10;

        // Unary Operators

        // System.out.println("Increment (prefix): " + (++a)); // Increment
        // System.out.println("Decrement (prefix): " + (--a)); // Decrement

        int b = 5;
       
        // System.out.println("Increment (postfix): " + (b++));
        // System.out.println("Value of b after postfix increment: " + b);
        System.out.println("Decrement (postfix): " + (b--)); // Postfix decrement
        System.out.println("Value of b after postfix decrement: " + b);

        System.out.println("Negation: " + (~a)); // Negation
    }
}