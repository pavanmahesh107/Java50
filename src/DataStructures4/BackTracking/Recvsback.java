package DataStructures4.BackTracking;

import java.util.Scanner;

public class Recvsback {
    public static void printnumbers(int i, int n){
        // Using recursion
        if(i > n){
            return;
        }
        System.out.println(i + " ");
        printnumbers(i+1,n);
    }

    public static void usingBacktrack(int i, int n){
        if(i>n){
            return;
        }
        usingBacktrack(i+1,n);
        System.out.println(i + " ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n value: ");
        int n = sc.nextInt();
        printnumbers(1,n);
        usingBacktrack(1,n);
    }
}
