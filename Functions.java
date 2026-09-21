class Functions {

    public static void main(String[] args) {
        // Functions F1 = new Functions();
        // System.out.println(F1.add(5, 3));
        System.out.println(add(5, 3));
        System.out.println(subtract(10, 4));
        System.out.println(multiply(6, 7));
        System.out.println(divide(20, 10));
        System.out.println(modulus(10, 0));
    }

    static int add(int a, int b) {
        return a + b;
    }

    static int subtract(int a, int b) {
        return a - b;
    }

    static int multiply(int a, int b) {
        return a * b;
    }

    static int divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return a / b;
    }

    static int modulus(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot perform modulus by zero");
        }
        return a % b;
    }

}