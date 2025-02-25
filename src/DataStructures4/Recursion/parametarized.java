package DataStructures4.Recursion;

import java.util.Scanner;

// Sum of first n numbers
public class parametarized {
  public static void fun(int i,int sum){
      if(i < 1){
          System.out.println(sum);
          return;
      }
      fun(i -1,sum + i);
  }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n Value: ");
        int n = sc.nextInt();
        fun(n,0);
    }
}
