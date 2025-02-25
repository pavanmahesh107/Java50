package DesignPatterns.Singleton.Instance;

// In Singleton, we want to restrict object creation to only one instance. By making the constructor private.
public class Singleton {
    // private static variable to hold the single instance.
    private static Singleton instance;

    // private constructor to prevent instantiation from other classes.
    private Singleton(){
        // By keeping the constructor private
        // 1. External classes cannot directly create an object of the class using the new keyword.
        // 2. The only way to get the instance is via the getinstance() method.
    }


}
