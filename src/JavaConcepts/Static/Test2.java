package JavaConcepts.Static;

public class Test2 {

//    static {
//        System.out.println("Static block");
//    }

    {
        System.out.println("non - static block");
    }

    public Test2(){
        System.out.println("Constructor");
    }

    public static void main(String[] args) {
        System.out.println("Main Method");
        new Test2();
    }
}
