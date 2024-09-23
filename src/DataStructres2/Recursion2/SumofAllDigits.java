package DataStructres2.Recursion2;
// Using recursion
// Dry run for the code in the Running Notes.
public class SumofAllDigits {
    public static int sumOfDigits(int n ){
        if(n == 0){
            return 0;
        }
        int D = n % 10;
        int temp = sumOfDigits(n/10);
        return temp + D;
    }
    public static void main(String[] args) {
      int res  = sumOfDigits(10034);
        System.out.println(res);
    }
}
