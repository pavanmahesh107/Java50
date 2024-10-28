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
        System.out.println("null");  // The Time Complexity of traversing a LinkedList is O(n).
    }

    // Purpose of Node current = head;
    //Initialization:
    //This line initializes a new variable, current, that will be used to traverse the linked list.
    // By setting current to head, you start the traversal from the beginning of the list.
    //Traversal Control:
    //As you iterate through the linked list, current acts as a pointer to the node currently being processed.
    // By moving current to the next node in each iteration, you can access all nodes in the linked list sequentially.

    public void insertAtEnd(int data){
        Node newNode = new Node(data);
        if(head == null){ // The time complexity here if the head is null is O(1). If the list is empty
            head = newNode;
            return;  // Prevents unnecessary traversal when the list is empty.
        }
        // Best Case (empty list): O(1)
        //Worst Case (non-empty list): O(n), where n is the number of nodes in the list.

        Node current = head;  // Important: current is a copy of the reference to the first node.
        // Modifying current will not affect the head.
        while (current.next!= null){
            current = current.next;
        }
        current.next = newNode;
    }

    public void insertionAtPoisiton(int data, int position){
        Node newNode = new Node(data);

        if(position == 0){ // Special Case: Insert at Head
            newNode.next = head;
            head = newNode;
            return;
        }
        Node current = head;
        for(int i = 0; i < position - 1 && current != null; i++){
            current = current.next;
        }
        if(current  == null){
            System.out.println("Position out of range");
            return;
        }
       newNode.next = current.next;
        current.next= newNode;

    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();


        list.insertAtBeginning(20);
        list.insertAtBeginning(10);
        list.insertAtBeginning(5);

        list.insertionAtPoisiton(15,1);
        list.insertionAtPoisiton(25,4);

        list.insertAtEnd(30);
        list.insertAtEnd(50);
        list.insertAtEnd(40);

        list.printList();
    }
}



