package DataStructures4.PriorityQueues;

import java.util.Collections;
import java.util.PriorityQueue;

public class KthSmallestElementinArray {
    public static int distinctElements(int[] arr, int k){
        // Step1: Creating the Maximum priority queue.
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());  // Max heap

        // Step2: Adding the first K elements into the PQ
        for(int i = 0; i < k; i ++){
            pq.add(arr[i]);
        }
        //Step3: Process the remaining elements.
        for(int i = k; i < arr.length; i++){
            if(arr[i] < pq.peek()){
                pq.poll();
                pq.add(arr[i]);
            }
        }
        return pq.peek();
    }
    public static void main(String[] args) {
        int[] arr = {-3, 6, 2, 0, 8, 7, 10, 4};
        int k = 4;
        System.out.println("The " + k + "th smallest element is " + distinctElements(arr,k));
    }
}


// The Time Complexity is O(NlogK)
// The Space Complexity is O(K)