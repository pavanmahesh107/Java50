package DesignPatterns.Singleton;

public class Main {
    public static void main(String[] args) {
        DoubleCheckLocking doubleCheckLocking1 = DoubleCheckLocking.getInstance();
        DoubleCheckLocking doubleCheckLocking2 = DoubleCheckLocking.getInstance();

        System.out.println("DEBUG");
    } //invalid method declaration; return a type required
}
