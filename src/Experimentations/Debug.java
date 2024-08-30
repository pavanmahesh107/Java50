package Experimentations;

public class Debug {
    public String getMethodName(final int depth) {
        final StackTraceElement[] ste = Thread.currentThread().getStackTrace();
        String name = ste[ste.length - 1 - depth].getClassName() + "." + ste[ste.length - 1 - depth].getMethodName();
        return name;
    }
}
