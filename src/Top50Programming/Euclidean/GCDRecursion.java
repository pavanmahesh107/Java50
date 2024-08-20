package Top50Programming.Euclidean;

import java.util.Scanner;

 // Uses the Euclidean algorithm recursively.

public class GCDRecursion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number:");
        int num1 = scanner.nextInt();

        System.out.println("Enter the second number:");
        int num2 = scanner.nextInt();

        int gcd = findGCD(num1, num2);  // Recursive case: Calls findGCD(b, a % b).
        System.out.println("The GCD of " + num1 + " and GCD of " + num2 + " is " + gcd);

        scanner.close();

    }

    public static int findGCD(int a, int b) {
        if (b == 0) {  // Base case: If b is zero, a is the GCD.
            return a;
        } else {
            return findGCD(b, a % b);
        }
    }
}

 // time complexity & space complexity is O(log(min(a,b)))