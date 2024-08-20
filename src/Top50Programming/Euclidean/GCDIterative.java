package Top50Programming.Euclidean;

import java.util.Scanner;

public class GCDIterative {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number:");
        int num1 = scanner.nextInt();

        System.out.println("Enter the Second number:");
        int num2 = scanner.nextInt();

        int gcd = findGCD(num1, num2);
        System.out.println("The GCD of " + num1 + " and GCD of " + num2 + " is " + gcd);

        scanner.close();
    }

    public static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}

 // time complexity of O(log(min(a,b))) and a space complexity of O(1).