package DataStructres2.Hashing3.ObjectasaKey;

import java.util.HashMap;
import java.util.Objects;

public class CustomKey {  // Creating a custom class.

    private String name;
    private int roll_no;

    public CustomKey(String name, int roll_no){
        this.name = name;
        this.roll_no = roll_no;
    }


    @Override
    public int hashCode(){

        return Objects.hash(name,roll_no);
    }

    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustomKey customKey = (CustomKey) o;
        return roll_no == customKey.roll_no && Objects.equals(name,customKey.name);
    }


    @Override
    public String toString(){
        return "customKey{" +
                "name='" + name + "' " +
                ",roll_no=" + roll_no +
                '}';
    }

    public static void main(String[] args) {
        HashMap<CustomKey, String> hashMap = new HashMap<>();

        CustomKey customKey1 = new CustomKey("Alice", 1 );
        CustomKey customKey2 = new CustomKey("Bob", 2 );
        CustomKey customKey3 = new CustomKey("Alice", 1 ); // same as key1


        hashMap.put(customKey1,"Developer");
        hashMap.put(customKey2, "Designer");
        // Will overwrite the value of key1 because key3 is equal to key1
        hashMap.put(customKey3, "Manager");


        // Printing the Map
        for(CustomKey key: hashMap.keySet()){
            System.out.println(key + ":  "+hashMap.get(key) );
        }

    }
}
