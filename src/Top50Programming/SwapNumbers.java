package Top50Programming;

// How do you swap two numbers without using a third variable in Java?

public class SwapNumbers {
    public static void main(String[] args) {
        int a = 15;
        int b = 18;
        System.out.println("a value before swapping is " +a + " b value before swapping is " +b );

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("a value after swapping is " +a + " b value after swapping is " +b );
    }
}
