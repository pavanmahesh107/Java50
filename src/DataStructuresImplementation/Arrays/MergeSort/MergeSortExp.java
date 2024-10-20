package DataStructuresImplementation.Arrays.MergeSort;

public class MergeSortExp {
    public static void mergeSort(int[] arr, int left, int mid, int right) {
        // Find sizes of two subarrays to be merged
        int n1 = mid - left + 1;
        int n2 = right - mid;

        // Create temp arrays
        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        // Copy data to temp arrays
        for (int i = 0; i < n1; i++) {
            leftArray[i] = arr[left + i];
        }
        for (int j = 0; j < n2; j++) {
            rightArray[j] = arr[mid + 1 + j];
        }

        // Code segment for merging the two arrays
        int i = 0, j = 0;
        int K = left;

        while (i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[j]) {
                arr[K] = leftArray[i];
                i++;
            } else {
                arr[K] = rightArray[j];
                j++;
            }
            K++;
        }

        // Remaining elements in any of the temporary array.
        while (i < n1) {  // For the left Sub Array.
            arr[K] = leftArray[i];
            i++;
            K++;
        }

        while (j < n2) {  // For the right Sub Array.
            arr[K] = rightArray[j];
            j++;
            K++;
        }

    }

    public static void sort(int[] arr, int left, int right) {
        if (left < right) {

            // Find the middle point.
            int mid = left + (right - left) / 2; // Here mid is calculated left +(right - left) / 2 because to avoid integer Overflow.

            // Recursively Sort first and Second halves.
            sort(arr, left, mid);
            sort(arr, mid + 1, right);  // Here why sort (arr, mid + 1, right) why mid + 1,
            // already mid is used in left subarray, so the next element is mid + 1.

            // Merge the sorted halves.
            mergeSort(arr, left, mid, right);

        }
    }

    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6, 7};
        int n = arr.length;

        System.out.println("Original Array");
        printArray(arr);

        sort(arr, 0, n - 1);

        System.out.println("Sorted Array");
        printArray(arr);
    }

    public static void printArray(int[] arr) {
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
}

 // Time Complexity:
//Best Case: O(n log n), When the array is already sorted or nearly sorted.
//Average Case: O(n log n), When the array is randomly ordered.
//Worst Case: O(n log n), When the array is sorted in reverse order.
//Auxiliary Space: O(n), Additional space is required for the temporary array used during merging.