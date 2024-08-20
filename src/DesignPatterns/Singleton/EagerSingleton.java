package DesignPatterns.Singleton;
// The Eager Singleton it comes into picture when there is a synchronization problem.(Multi threaded environment).
public class EagerSingleton {
    private static final EagerSingleton INSTANCE = new EagerSingleton();

    private EagerSingleton() {  //Private Constructor to prevent Instantiation.
    }

    public static EagerSingleton getInstance() { // This method provides a global point of access to the singleton instance.
        return INSTANCE;
    }

    public static void main(String[] args) {
        EagerSingleton eagerSingleton = EagerSingleton.getInstance();
        eagerSingleton.showmessage();
    }

    public void showmessage() {
        System.out.println("Hello, from Eager Singleton");
    }
}
// Drawbacks to using EagerSingleton ,
// 1. Application startup time will increase.
// 2. We can't give attributes while object creation.