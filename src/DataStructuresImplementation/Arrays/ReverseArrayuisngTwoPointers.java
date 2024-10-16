package DataStructuresImplementation.Arrays;

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
