package DesignPatterns.Prototype;

public class Student implements Prototype<Student>{
    String name;
    int age;
    String batch;
    double psp;
    double avgPsp;
    String city;

    @Override
    public Student  clone() {
        return null;
    }
}
