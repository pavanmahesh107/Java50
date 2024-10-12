package DataStructuresImplementation.Arrays;

import java.util.Arrays;

public class Characterarray {
    public static void main(String[] args) {
        String myString = "Hello, World";
        char[] myChar = myString.toCharArray();  // toCharArray -> Converts a String into Array of Characters.

        System.out.println(Arrays.toString(myChar));  //Arrays.toString -> Converts an Array into Human readable String.
    }
}
