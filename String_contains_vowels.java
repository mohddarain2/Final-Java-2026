import java.util.Scanner;

public class String_contains_vowels {
    public static  void main(String [] args){
        System.out.println("Please Enter String");
        Scanner sc = new Scanner(System.in);
        String check = sc.nextLine();
        boolean checkString = stringContainsVowel(check);
        if(checkString){
            System.out.println("this string is vowel");
        }else{
            System.out.println("this string is consonant");
        }
      

    }
    public  static boolean stringContainsVowel(String para){
        return  para.toLowerCase().matches(".*[aeiou].*");
    }
}
