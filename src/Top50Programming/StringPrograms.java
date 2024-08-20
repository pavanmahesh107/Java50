package Top50Programming;
// How do you reverse a String in Java?
// The following Program works for Reversing a regular String, String with numbers, Palindrome String & for an empty String.
// There is no reverse() utility method in String class.
public class StringPrograms {
    public static void main(String[] args) {
        String str1 = "Pavan Mahesh"; //Reverse a regular string
        //String str2 = "123456789"; Reverse a string with numbers.
        //String str3 = "madam"; Reverse a Palindrome String.
        //String str4 = ""; Reverse an empty string.

        System.out.println(reverse(str1));
    }
    public static String reverse(String in) {
        if (in == null)
            throw new IllegalArgumentException("Null is not valid input");
        StringBuilder out = new StringBuilder(); //Initialized the StringBuilder to build the reversed string efficiently.
        char[] chars = in.toCharArray(); //Converts the input string into a character array.
        for (int i = chars.length - 1; i >= 0; i--) //Iterates over the character array from end to beginning.
            out.append(chars[i]); //Appends(Adding) each character from the end of the array to the string builder.
        return out.toString(); //Converts the String Builder back to String and returns it.
    }
}

// We can also use the String, Buffer, but String Builder is not Synchronized, so It is faster,