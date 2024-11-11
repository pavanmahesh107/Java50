package DataStructures4.PriorityQueues;

// Given an array print median of all prefix Subarrays.(Prefix subarray means Subarray starting with index 0).

import java.util.Collections;
import java.util.PriorityQueue;

public class PrintMedian {
    public static void runningMedian(int[] arr) {
        int n = arr.length;
        ;
        // Creating two Priority Queues of Min Heap.
        PriorityQueue<Integer> minPQ = new PriorityQueue<>();
        // Creating two Priority Queues of Max Heap.
        PriorityQueue<Integer> maxPQ = new PriorityQueue<>(Collections.reverseOrder());

        // Condition 1:
        for (int i = 0; i < n; i++) {
            //Step1: Add the new element to one of the heaps.
            if (maxPQ.isEmpty() || arr[i] <= maxPQ.peek()) {
                maxPQ.add(arr[i]);
            } else {
                minPQ.add(arr[i]);
            }

            // Step 2: Balance the heaps.
            if (maxPQ.size() > minPQ.size() + 1) {
                minPQ.add(maxPQ.poll());
            } else if (minPQ.size() > maxPQ.size()) {
                maxPQ.add(minPQ.poll());
            }

            // Step 3: Caluclate and print the median for the current prefixes.
            if (maxPQ.size() == minPQ.size()) {
                // Even number of elements, average of two middle elements
                int median = (maxPQ.peek() + minPQ.peek()) / 2;
                System.out.println("Median of prefix [0-" + i + "]: " + median);
            } else {
                // Odd number of elements, max of maxPQ
                System.out.println("Median of prefix [0-" + i + "]: " + maxPQ.peek());
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {4, 6,10,9,2,15,3,7,11};
        runningMedian(arr);
    }
}


 // The Time Complexity is O(n log n) and Space Complexity is O(n).
