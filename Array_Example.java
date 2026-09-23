public class Array_Example {
    public static void main(String[]args){
        // Array is create multiple way 
        // int [] arr1 = new int[5]; // create an array of size 5
        // arr1[0] = 10;
        // arr1[1] = 20;
        // arr1[2] = 30;
        // arr1[3] = 40;
        // arr1[4] = 50;
        // System.out.println("Array 1 elements are: " + arr1[0]);
        // System.out.println("Array 1 elements are: " + arr1[1]);
        // System.out.println("Array 1 elements are: " + arr1[2]);
        // System.out.println("Array 1 elements are: " + arr1[3]);
        // System.out.println("Array 1 elements are: " + arr1[4]);


        // -----------------------------------------------------
        int[] arr2 = {10, 5, 3, 40, 50}; // create an array of size 5
        // System.out.println("Array 2 elements are: " + arr2[0]);
        // System.out.println("Array 2 elements are: " + arr2[1]);
        // System.out.println("Array 2 elements are: " + arr2[2]);         

        // for(int i=0;i<arr2.length;i++){
        //     System.out.println("Array 2 elements are: " + arr2[i]);
        // }
        // array of sum of 5 numbers
        // int sum = 0;
        // for(int i=0;i<arr2.length;i++){ // 0<5 
        //     sum=sum+arr2[i]; // sum = 0+10=10, sum=10+20=30, sum=30+30=60, sum=60+40=100, sum=100+50=150

        // }
        // System.out.println("Sum of array elements are: " + sum);

        //-----------------------------------------------------
        // array of even numbers + Sum,,
        int sumEvenNumber = 0;
        int sumOddNumber = 0;
        for(int i=0;i<arr2.length;i++){
            if(arr2[i]%2==1){ // check if the number is even // 10%2=0, 20%2=0, 30%2=0, 40%2=0, 50%2=0
                //System.out.println("Even numbers are: " + arr2[i]);
                //sumEvenNumber += arr2[i];
                sumOddNumber += arr2[i];
            }
        }
        System.out.println("Sum of even numbers are: " + sumEvenNumber);
        System.out.println("Sum of odd numbers are: " + sumOddNumber);


    }
}
