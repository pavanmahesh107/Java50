package DataStructuresImplementation;

public class QuickSortExam {

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high]; //Choosing the last element as Pivot.
        int i = (low - 1); // index of smaller element.

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        // Swap arr[i+1] and arr[high]
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    // Function to perform quick sort
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int par = partition(arr, low, high);
            quickSort(arr, low, par - 1);
            quickSort(arr, par + 1, high);
        }
    }

    public static void main(String[] args) {
        int[] arr = {10, 7, 8, 9, 1, 5};
        int n = arr.length;
        System.out.println("Original Array");
        printArray(arr);

        quickSort(arr, 0, n - 1);

        System.out.println("Sorted Array");
        printArray(arr);
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

// Time Complexity:
//
//Best Case: (Ω(n log n)), Occurs when the pivot element divides the array into two equal halves.
//Average Case (θ(n log n)), On average, the pivot divides the array into two parts, but not necessarily equal.
//Worst Case: (O(n²)), Occurs when the smallest or largest element is always chosen as the pivot (e.g., sorted arrays).

//Auxiliary Space: O(n), due to recursive call stack
//
//Advantages of Quick Sort
//
//It is a divide-and-conquer algorithm that makes it easier to solve problems.
//It is efficient on large data sets.
//It has a low overhead, as it only requires a small amount of memory to function.
//It is Cache-Friendly as we work on the same array to sort and do not copy data to any auxiliary array.
//Fastest general purpose algorithm for large data when stability is not required.
//It is tail recursive and hence all the tail call optimization can be done.

//Disadvantages of Quick Sort
//
//It has a worst-case time complexity of O(n2), which occurs when the pivot is chosen poorly.
//It is not a good choice for small data sets.
//It is not a stable sort,
// meaning that if two elements have the same key,
// their relative order will not be preserved in the sorted output in case of quick sort,
// because here we are swapping elements according to the pivot’s position
// (without considering their original positions).

//Applications of Quick Sort
//
//Efficient for sorting large datasets with O(nlogn) average-case time complexity.
//Used in partitioning problems like finding the kth smallest element or dividing arrays by pivot.
//Integral to randomized algorithms, offering better performance than deterministic approaches.
//Applied in cryptography for generating random permutations and unpredictable encryption keys.
//Partitioning step can be parallelized for improved performance in multicore or distributed systems.
//Important in theoretical computer science for analyzing average-case complexity and developing new techniques.