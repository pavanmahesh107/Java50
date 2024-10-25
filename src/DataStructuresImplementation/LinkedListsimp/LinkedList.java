package DataStructuresImplementation.LinkedListsimp;
// Node structure
class Node {   // Node class representing each node of the linked list.
    int data;  // value stored in the node.
    Node next;  // Reference to the next node.

    Node(int data) {   // Constructor to initialize a new node.
        this.data = data;
        this.next = null; // Next is initially null.
    }
}



