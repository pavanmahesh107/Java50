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

// Linked List class containing insertion methods.
class LinkedList{
    Node head; // Node of the list

    // Insert at the beginning
    // Time complexity = O(1)
    // The insertion at the beginning only involves creating a new node and updating two references,
    // regardless of the list size.
    public void insertAtBeginning(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void printList() { // Traverse the list to print all the elements.
        Node current = head; // sets current to the head of the list so that the traversal starts at the first node.
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;  // Moves the current pointer to the next node in the list.
            // This is crucial for ensuring that you visit each node.
        }
        System.out.println("null");
    }

    // Purpose of Node current = head;
    //Initialization:
    //This line initializes a new variable, current, that will be used to traverse the linked list.
    // By setting current to head, you start the traversal from the beginning of the list.
    //Traversal Control:
    //As you iterate through the linked list, current acts as a pointer to the node currently being processed.
    // By moving current to the next node in each iteration, you can access all nodes in the linked list sequentially.

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.insertAtBeginning(50);
        list.insertAtBeginning(40);
        list.insertAtBeginning(30);
        list.insertAtBeginning(20);
        list.insertAtBeginning(10);
        list.insertAtBeginning(5);

        list.printList();
    }
}



