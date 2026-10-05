// // import java.util.Scanner;

// // public class String_contains_vowels {
// //     public static  void main(String [] args){
// //         System.out.println("Please Enter String");
// //         Scanner sc = new Scanner(System.in);

// //         String check = sc.nextLine();
// //         boolean checkString = stringContainsVowel(check);
// //         if(checkString){
// //             System.out.println("this string is vowel");
// //         }else{
// //             System.out.println("this string is consonant");
// //         }
      

// //     }
// //     public  static boolean stringContainsVowel(String para){
// //         return  para.toLowerCase().matches(".*[aeiou].*");
// //     }
// // }

// import java.util.Scanner;

// public class String_contains_vowels {

//     public  static  void main(String args[]){
        
//         System.out.print("Please enter String:");
//         Scanner sc = new Scanner(System.in);
//         String checkString_vowel_consonant = sc.nextLine();
//         boolean checkString = stringContainsVowel(checkString_vowel_consonant);
//         if (checkString) {
//             System.out.println("This string is vowel");
//         }else{
//             System.out.println("This string is consonant");
//         }

//         // System.out.println(stringCotainsVowel(checkString_vowel_consonant));

//     }
//     public  static  boolean stringContainsVowel(String para){
//         return  para.toLowerCase().matches(".*[aeiou].*");
//     }
// }
 import java.util.Scanner;
public class String_contains_vowels {
    public static void main(String[] args) {
        System.out.println("Please Enter String");
        Scanner sc = new Scanner(System.in);
        String check = sc.nextLine();
        boolean checkString = stringContainsVowel(check);
        if (checkString) {
            System.out.println("This string contains vowels");
        } else {
            System.out.println("This string does not contain vowels");
        }
    }

    public static boolean stringContainsVowel(String para) {
        return para.toLowerCase().matches(".*[aeiou].*");
    }
}