package DataStructuresImplementation.Arrays.TwoPointers;

// Two pointers for a single pair. If the array is Sorted.

public class TwoPointersExpforSingleoutput {
    public static void findPairWithSum(int[] arr, int target) {
        int left = 0; // Start pointer
        int right = arr.length - 1; // End pointer

        while (left < right) {
            int sum = arr[left] + arr[right];

            // If the sum is equals to the target, return true.
            if (sum == target) {
                System.out.println("Pair found: (" + arr[left] + "," + arr[right]+")");
                return;
                // If we want, the total number of pairs; we don't need the return statement. but the "No pair found with the given target sum" statement also prints.

            }
            if (sum < target) {
                left++;   // If the sum is lesser that the target, increment left to increase the sum.
            } else {
                right--; // If the sum is greater than the target, decrement right to decrease the sum.
            }
        }
        System.out.println("No pair found with the given target sum");
    }

    public static void main(String[] args) {
        int[] arr = {1,2,2,3,4,5,6,7};  // Sorted array
        int target = 7;
        findPairWithSum(arr, target);
    }
}
