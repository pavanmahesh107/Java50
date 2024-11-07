package DataStructures4.PriorityQueues;

import java.util.Collections;
import java.util.PriorityQueue;

public class BasicOperations {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        pq.add(10);  // The Time Complexity of Priority Queue for adding is O(log n) because adding an element to PQ for different values varies.
        pq.add(12);  // The default order of vales in PQ is from smallest to largest value. So while adding PQ, itself sorts the elements.
        pq.add(15);
        pq.add(5);
        pq.add(2);
        pq.add(42);
        pq.add(20);

        System.out.println(pq);

//        pq.peek();  // The T.C is O(1)
//        System.out.println("The Peek element of PQ is: " + pq.peek());
//        //pq.remove();
//        System.out.println("The element removed from PQ is: " +pq.remove());
//        System.out.println("The Peek element of PQ is: " + pq.peek());

        while (!pq.isEmpty()){
            int rem = pq.remove();
            System.out.print(rem + " ");
        }
    }
}
