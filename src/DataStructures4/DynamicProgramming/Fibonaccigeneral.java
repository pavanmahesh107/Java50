package DataStructures4.DynamicProgramming;

import java.util.Scanner;

public class Fibonaccigeneral {
    public static int fib(int n){
        if(n <= 1){
            return n;
        }
        int a = fib(n-1);
        int b = fib(n-2);
        return a+b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n Value: ");
        int n = sc.nextInt();
        System.out.println("The fibonacci number for fib(n) is: " + fib(n));
    }
}
