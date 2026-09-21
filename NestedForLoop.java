public class NestedForLoop {
    public static void main(String[] args) {
        
        // System.out.println("Print the table of 5 in reverse order");
        // for (int i=10;i>=1;i--){ // 10 10>1 || 9 9>1 | 8 8>1 | 7 7>1 | 6 6>1 | 5 5>1 | 4 4>1 | 3 3>1 | 2 2>1 | 1 1>=1 false
        //     System.out.println(5*i); // 50 // 45 // 40 // 35 // 30 // 25 // 20 // 15 // 10 // 5
        // }

        // System.out.println("Print the table of 5 in reverse order with Even numbers");
        // for (int i = 10; i >= 1; i--) {   // 10 10>1 || 9 9>1 | 8 8>1 | 7 7>1 | 6 6>1 | 5 5>1 | 4 4>1 | 3 3>1 | 2 2>1 | 1 1>=1 false    
        //     if (i % 2 == 0) {  // 10%2==0 true | 9%2==0 false | 8%2==0 true | 7%2==0 false | 6%2==0 true | 5%2==0 false | 4%2==0 true | 3%2==0 false | 2%2==0 true | 1%2==0 false
        //         System.out.println(5 * i);
        //     }
        // }


        for(int i=1;i<=5;i++){
            for(int j=1;j<5;j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
