package Top50Programming.Fibonacci;

import java.util.Scanner;

// Fibonacci series upto nth term using Recursion.

public class FibonacciRecursion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //The scanner class is used to take the input fro the user.

        System.out.println("Enter the number of terms for the fibonacci series: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a positive integer");
        } else {
            System.out.println("Fibonacci series up to" + n + "terms");
            for (int i = 0; i < n; i++) {
                System.out.println(fibonaccirecur(i) + " ");
            }
        }
        scanner.close();
    }
    public static int fibonaccirecur(int n) { // A function calls itself within its own body.
        if (n == 0) {  // Breaks down a problem into smaller similar sub-problems until a base case is reached (A case that doesn't require the further recursion).
            return 0;
        } else if (n == 1) { // Follows divide and conquer approach.
            return 1;
        } else {
            return fibonaccirecur(n - 1) + fibonaccirecur(n - 2);
        }
    }
}

//Time Complexity
//The time complexity of the naive recursive approach to computing the nth Fibonacci number is exponential. Specifically, it is O(2 power n).
//Explanation:
//The function fibonacci(n) calls itself twice: fibonacci(n - 1) and fibonacci(n - 2).
//This results in a binary tree of calls, where each call generates two more calls, leading to exponential growth.
//The same subproblems are recomputed multiple times, leading to an overall time complexity of O(2 power n).
