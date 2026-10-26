public class Anonymous_Arrays {
    public static void main(String[] args) {
        // Anonymous array
        //int sum = 0;
        // for (int i : new int[]{1, 2, 3, 4, 5}) {
        //     sum += i;
        // }
        // for(int i=0; i<new int[]{1, 2, 3, 4, 5}.length; i++){
        //     sum += new int[]{1, 2, 3, 4, 5}[i];
        // }
        //System.out.println("Sum: " + sum);

        //------------------------------------------------------------------------
        // Anonymous array as method argument
        sum(new int[]{1, 2, 3, 4, 5});
    }
    public static void sum(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i; // 
        }
        System.out.println("Sum: " + sum);
    }
}
