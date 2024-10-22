package DataStructuresImplementation.Arrays.SlidingWindow;


// Find a maximum sum of K consecutive elements
public class SlidingWindowExam {
    public static int maxSum(int[] arr, int k) {
        // Edge case: checking if the k is in bounded with in the length of an array.
        if (arr.length < k) {
            System.out.println("Invalid input: k is larger than the array length");
            return -1;
        }

        // Caluclate the sum of the first 'k' elements(initial window).
        // T.C = O(k) for the first k elements.
        int maxSum = 0;
        for (int i = 0; i < k; i++) {
            maxSum += arr[i];
        }

        // Use the sliding window technique to find the maxSum.
        // T.C = O(n-k) ~ O(n); For the remaining elements,
        // we perform n - k operations (one iteration per element), each taking constant time O(1).
        int windowSum = maxSum;
        for (int i = k; i < arr.length; i++) {
            windowSum += arr[i] - arr[i - k];
            maxSum = Math.max(maxSum, windowSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int k = 3;
        int res = maxSum(arr,k);
        System.out.println("The maximum sum of " + k + " consecutive element is: " + res);
    }
}

// Overall T.C is O(k) + O(n-k) = O(n)
// Time complexity - O(n)
// Space complexity - O(1)