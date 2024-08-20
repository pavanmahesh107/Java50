package DesignPatterns.Singleton;

public class DoubleCheckLocking {
    private static DoubleCheckLocking INSTANCE = null;

    private DoubleCheckLocking(){

    }
    public static DoubleCheckLocking getInstance(){
        if(INSTANCE == null){
            synchronized (DoubleCheckLocking.class){
                if (INSTANCE == null){
                    INSTANCE = new DoubleCheckLocking();
                }
            }
        }
        return INSTANCE;
    }
}
