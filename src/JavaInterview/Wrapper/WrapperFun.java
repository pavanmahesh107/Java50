package JavaInterview.Wrapper;

// Putting a primitive type of data type into a wrapper class is called boxing.
// Bringing out the primitive type of data from the wrapper class is called unboxing.
// In the collection framework we only use wrapper classes
public class WrapperFun {
    public static void main(String[] args) {
        int i = 20;
        Integer iii = 32;
        WrapperFun wc = new WrapperFun();
        Integer i1 = new Integer(55); // Boxing
        Integer i2 = Integer.valueOf(55); // Boxing same as the above, but Integer is deprecated in the JAVA 9 version.
        // using static factory method.
        Integer i3 = i;  // Auto boxing.

        int ii = i2.intValue();  // unboxing
        int i4 = i2;  // Auto unboxing. Java was making it automatically so it is auto unboxing.
        System.out.println(i4);

        // Converting a string into an int.
        String st = "14";
        int in = Integer.valueOf(st); // returning wrapper class instance(Integer).
        int age = Integer.parseInt(st);
        System.out.println(age);

    }
}
