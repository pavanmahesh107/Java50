package Top50Programming;

// Write a Program to check if a vowel is present in a String? This question is doubt.
public class StringContainsVowels {
    public static void main(String[] args) {
        System.out.println(stringContainsVowels("HELLO"));
        System.out.println(stringContainsVowels("TV"));
    }

    public static boolean stringContainsVowels(String input) {
        return input.toUpperCase().matches(".*[AEIOU].*");
    }
}

// The below class works for a lower case Vowels {aeiou}.

//
//public class StringContainsVowels {
//    public static void main(String[] args) {
//        System.out.println(stringContainsVowels("Hello"));
//        System.out.println(stringContainsVowels("TV"));
//    }
//
//    public static boolean stringContainsVowels(String input) {
//        return input.toLowerCase().matches(".*[aeiou].*");
//    }
//}