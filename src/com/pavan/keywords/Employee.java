package com.pavan.keywords;


// This keyword in Java
public class Employee {

    int age = 25;

    public Employee(){
        System.out.println(this.age);
    }

    public static void main(String[] args) {
        Employee e = new Employee();
        e.setAge(50);
        System.out.println(e.getAge());

        Employee e1 = new Employee();
        e1.setAge(10);
        System.out.println(e1.getAge());

        Employee e2 = new Employee();
        e2.setAge(20);
        System.out.println(e2.getAge());

    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
       this.age = age;
    }

    {
        System.out.println(this.getAge());
    }
}
