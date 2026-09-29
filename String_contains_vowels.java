import java.util.Scanner;

public class String_contains_vowels {
    public static  void main(String [] args){
        System.out.println("Please Enter String and after enter String then check this string is vowel and consonant | True is vowel and Fasle is");
        Scanner sc = new Scanner(System.in);
        String check = sc.nextLine();
        System.out.println(stringContainsVowel(check));

    }
    public  static boolean stringContainsVowel(String para){
        return  para.toLowerCase().matches(".*[aeiou].*");
    }
}
