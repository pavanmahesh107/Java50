package DataStructuresImplementation.Arrays;

public class ReverseArrayusingNave {
    public static void reverseArray(int[] arr) {
        int n = arr.length;

        // Temporary array to store elements in reverse order
        int[] temp = new int[n];

        // copy all the elements from an original array into a temp array in reverse order.
        for (int i = 0; i < n; i++) {
            temp[i] = arr[n - i - 1];
        }

        // Copy all the elements from the temp array back to the original array
        for (int i = 0; i < n; i++) {
            arr[i] = temp[i];
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 3, 2, 6, 5};
       reverseArray(arr);

       for(int i = 0; i < arr.length; i++){
           System.out.print(arr[i] + " ");
       }
        System.out.println();
    }
}

// Time complexity is O(n) and Space complexity is O(n)
// We can reduce the space complexity by using two pointer technique and swapping values.

//The idea is to use a temporary array to store the reverse of the array.
//Create a temporary array of the same size as the original array.
//Now, copy all elements from an original array to the temporary array in reverse order.
//Finally, copy all the elements from a temporary array back to the original array.