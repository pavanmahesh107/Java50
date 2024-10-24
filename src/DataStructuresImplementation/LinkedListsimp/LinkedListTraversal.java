package DataStructuresImplementation.LinkedListsimp;
// Node structure
class Node {
    int data;  // value stored in the node.
    Node next;  // Reference to the next node.

    Node(int data) {
        this.data = data;
        this.next = null; // Next is initially null.
    }
}

public class LinkedListTraversal {
     Node head;

     public void traverse(){
         Node current = head;
         while( current != null){
             System.out.println(current.data + " -> ");
             current = current.next;
         }
         System.out.println("null");
     }
}
