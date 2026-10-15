public class GreaterThreeNumber {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 30;
        int num3 = 0;

        // if (num1 > num2 && num1 > num3) {
        //     System.out.println(num1 + " is the greatest number.");
        // } else if (num2 > num1 && num2 > num3) {
        //     System.out.println(num2 + " is the greatest number.");
        // } else if (num3 > num1 && num3 > num2) {
        //     System.out.println(num3 + " is the greatest number.");
        // } else {
        //     System.out.println("All three numbers are equal.");
        // }


        // ------------------------------------------
        if(num1>num2){
            if(num1>num3){
                System.out.println(num1+" is the greatest number.");
            }else{
                System.out.println(num3+" is the greatest number.");
            }
        }else{
            if(num2>num3){
                System.out.println(num2+" is the greatest number.");
            }else{
                System.out.println(num3+" is the greatest number.");    
    }
}
        }
    }
