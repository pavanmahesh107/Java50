package DataStructuresImplementation.Arrays.TwoPointers;

public class ReverseArrayuisngTwoPointers {
    public static void reverseArray(int[] arr){
        int left  = 0;
        int right  = arr.length -1;  // Because the index is starting from 0.

        // Iterate till left is less than a right.
        while(left < right){

            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            // Increment the left pointer.
            left ++;

            // Decrement the right pointer.
            right--;

        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 4, 3, 2, 6, 5};
         reverseArray(arr);

        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
}

 // Using Two Pointers – O(n) Time and O(1) Space

//The idea is to maintain two pointers: left and right,
// such that left points at the beginning of the array and right points to the end of the array.
//
//While a left pointer is less than the right pointer, swap the elements at these two positions.
// After each swap, increment the left pointer and decrement the right pointer to move towards the center of an array.
// This will swap all the elements in the first half with their corresponding element in the second half.