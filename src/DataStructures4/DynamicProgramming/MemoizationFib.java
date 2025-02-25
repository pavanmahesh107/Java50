package DataStructures4.DynamicProgramming;

import java.util.Scanner;

public class MemoizationFib {
    public static int fib(int n, int[] memo){
        if(n<= 1) return n;  // Base case (It helps to stop the recursion).

        if(memo[n] != 0){
            return memo[n];
        }

        memo[n] = fib(n-1,memo) + fib(n-2,memo);
        return memo[n];
    }
   public static int fibonacci(int n){
       int[] memo = new int[n+1];   //Memoization Table
       return fib(n,memo);
   }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n value: ");
        int n = sc.nextInt();
        int result = fibonacci(n);
        System.out.println("The fibonacci of " +n+ " value using dynamic program is:" + result);
    }
}
