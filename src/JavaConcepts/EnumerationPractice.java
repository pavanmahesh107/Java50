package JavaConcepts;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationPractice {
    // It is used to iterate on the legacy collection objects.
    // Like - HashTable, Stack, Vector, Dictionary, Properties. legacy means - classes & interfaces of JAVA 1.0 version.
    public static void main(String[] args) {

        Vector<String> vector = new Vector<>();
        Enumeration<String> e  = vector.elements();
    }
}
