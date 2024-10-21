package DataStructuresImplementation.Arrays.Searching;

public class BinarySearchingIterative {

    // Iterative implementation of binary search.
    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Check if the target is present in the mid.
            if (arr[mid] == target) {
                return mid; // Target found.
            }

            // If the target is greater, ignore the left half.
            if (arr[mid] < target) {
                left = mid + 1;
            } else {
                // If the target is lesser, ignore the right half.
                right = mid - 1;
            }
        }

        return -1; // Target not found.
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 7, 11, 13, 17};
        int target = 11;

        int res = binarySearch(arr, target);
        if (res == -1) {
            System.out.println("Target not  found");
        } else {
            System.out.println(" Target found at index : " + res);
        }
    }
}

// Time Complexity: O(log n) since the array is divided into two halves at each step.
// Space Complexity : O(1) since no extra spaces used.

// https://chatgpt.com/share/6715ec0c-dbfc-800c-99d4-53ccf8f7af9a