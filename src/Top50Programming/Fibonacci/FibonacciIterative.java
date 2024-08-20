package Top50Programming.Fibonacci;

import java.util.Scanner;

public class   FibonacciIterative {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of terms for the fibonacci series: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println(" Please enter a positive integer");
        } else {
            System.out.println("Fibonacci series upto" + n + "terms");
            fibonacciiterative(n);
        }
        scanner.close();
    }
    public static void fibonacciiterative(int n) {
        int first = 0, second = 1;
        for (int i = 1; i <= n; i++) {
            System.out.println(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }
    }
}

// Time Complexity for an Iterative approach is O(n). --> The for loop runs n times.
// Space Complexity for an iterative approach is O(1). --> Only constant amount of extra space is used(Variables 'first', 'second', and 'next').
