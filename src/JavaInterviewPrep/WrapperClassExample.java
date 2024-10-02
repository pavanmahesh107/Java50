package JavaInterviewPrep;

import java.util.ArrayList;

public class WrapperClassExample {
    public static void main(String[] args) {

        // Creating an ArrayList to store Integer Objects
        ArrayList<Integer> arrayList = new ArrayList<>();

        // Adding primitive int values (Autoboxing)
        arrayList.add(10);  // Automatically converted to Integer.valueOf(10)
        arrayList.add(20);
        arrayList.add(30);
        arrayList.add(40);

        System.out.println("Integer List " + arrayList);

        // Retrieving the elements
        int firstElement = arrayList.get(0);   // Automatically converted into int.
        System.out.println("First Element " + firstElement);

        // Using Wrapper class methods
        String numberStr = "1518";
        int parsedNumber = Integer.parseInt(numberStr);  // Converting String into int
        System.out.println("parsedNumber " + parsedNumber);

        // Converting int into String
        int stringNum = 123;
        String numAsString = Integer.toString(stringNum);
        System.out.println("numAsString "+ numAsString);

        // Comparing two integers
        Integer  a = 100;
        Integer  b = 100;
        Integer  c = 128;
        Integer  d = 128;

        System.out.println("a == b: "+ (a==b)); // true (cached values)
        System.out.println("c == d: "+ (c==d)); // false (outside cached range)

        // Using Character Wrapper
        char charObi = 'A';
        if (Character.isUpperCase(charObi)){
            System.out.println(charObi +  " is uppercase.");
        }




    }
}
