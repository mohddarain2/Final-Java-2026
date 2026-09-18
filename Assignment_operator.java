public class Assignment_operator {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        // Assignment Operators
        a += b; // a = a + b
        System.out.println("After += operation, a: " + a);
        
        a -= b; // a = a - b
        System.out.println("After -= operation, a: " + a);
        
        a *= b; // a = a * b
        System.out.println("After *= operation, a: " + a);
        
        a /= b; // a = a / b
        System.out.println("After /= operation, a: " + a);
        
        a %= b; // a = a % b
        System.out.println("After %= operation, a: " + a);
    }
}
