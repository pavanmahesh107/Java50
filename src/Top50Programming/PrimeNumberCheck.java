package Top50Programming;

public class PrimeNumberCheck {
    public static void main(String[] args) {
        System.out.println(isPrime(19));
        System.out.println(isPrime(45));
    }
    public static boolean isPrime(int n) {
        if (n == 0 || n == 1) {
               return false;
        }
        if (n == 2) {
            return true;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
