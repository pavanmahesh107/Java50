package DataStructres2.Hashing3.ObjectasaKey;

import java.util.HashSet;

public class Main {

    public static class Student {
        int id;
        String name;

        public Student(int id, String name) {
            this.id = id;
            this.name = name;
        }

        @Override
        public int hashCode() {
            return id;
        }

        @Override
        public boolean equals(Object obj) {
           Student student = (Student) obj;
           if(student.id == this.id && student.name == this.name){
               return true;
           } else {
               return false;
           }
        }
    }

    public static void fun() {
        int[] ID = {6055, 6091, 6055, 6099, 6094, 6058, 6099};
        String[] name = {"Raj", "Rajeev", "Raj", "Simran", "SimranJeet", "Raj", "Simran"};

        int n = ID.length;
        Student[] arr = new Student[n];

        for (int i = 0; i < n; i++) {
            Student s = new Student(ID[i], name[i]);
            arr[i] = s;
        }

//        for (Student st : arr) {
//            System.out.println(st.id + ": " + st.name);
//        }

        HashSet<Student> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            set.add(arr[i]);
        }

        for(Student s : set){
            System.out.println(s.id + ": " + s.name);
        }

    }
    public static void main(String[] args) {
        fun();
    }
}
