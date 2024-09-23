package DataStructres2.Hashing3.ObjectasaKey;

import java.util.HashSet;

public class Children {
    int id;
    String name;

    public Children(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public static void function() {
        int[] id = {6055, 6091, 6055, 6099, 6094, 6058, 6099};
        String[] name = {"Raj", "Rajeev", "vijay", "Naveen", "Kohli", "Ram", "sita"};

        int n = id.length;
        Children[] arr = new Children[n];

        for (int i = 0; i < n; i++) {
            Children children = new Children(id[i], name[i]);
            arr[i] = children;
        }

//        for (Children ch : arr) {
//            System.out.println(ch.id + ": " + ch.name);
//        }


        HashSet<Children> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            set.add(arr[i]);
        }

        for (Children ch : set) {
            System.out.println(ch.id + ": " + ch.name);
        }
    }

    public static void main(String[] args) {
        function();
    }

    public int hashCode() {
        return id;
    }

    public boolean equals(Object obj) {
        Children children = (Children) obj;
        if (children.id == this.id && children.name == this.name) {
            return true;
        } else {
            return false;
        }
    }
}
