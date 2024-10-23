package DataStructuresImplementation.Arrays.TwoPointers;


// Check for palindrome using Two pointers in a string.

public class PalindromeCheck {
    public static boolean isPalindrome(String str){
        int left = 0;
        int right = str.length() - 1;

        // Checking the edge case. Edge case -- if the string is empty, then it's also a palindrome because an empty string is considered as palindrome.
        if(str.isEmpty()){
            return true;
        }

        // Using Two pointers to check the given String is a palindrome or not.
        while (left < right){
            if (str.charAt(left) != str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;  // If all characters are match.
    }
    public static void main(String[] args) {
        String str = "sass";
        boolean res = isPalindrome(str);
        System.out.println(res);
    }
}
