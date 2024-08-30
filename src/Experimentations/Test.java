package Experimentations;

public class Test {
    public static void main(String[] args) {
        new Test().method1();
    }
    void method1(){
        method2();
    }
    void method2(){
        Debug debug = new Debug();
        String methodname = debug.getMethodName(1);
        System.out.println("Called by: " + methodname);
    }

}
