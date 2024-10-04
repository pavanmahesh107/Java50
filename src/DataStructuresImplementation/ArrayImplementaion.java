package DataStructuresImplementation;

 // Implementing an Array

public class ArrayImplementaion {
    public static void main(String[] args) {
        //Declaring and initializing an array of size 5
        int[] arr = new int[5];

        // inserting elements into the array.
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 10;

        // Accessing and printing elements of the array.
        for(int i =0; i < arr.length;i++){
            System.out.println("Element at index " +i+ ":" + arr[i]);
        }

        // Updating an element at a specific index.
        arr[2] = 50;
        System.out.println("Updated element at index 2: "+arr[2]);
    }
}
