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
            current = current.next;  // Setting current = current.next makes current points to the next node
            // (Because we have to traverse fully into the linked list)
            // Moves the current pointer to the next node in the list.
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

    // The overall time complexity for the insertAtPosition method depends on the position where the insertion is being performed:
    //
    //Best case: O(1) (insertion at the head)
    //Worst case: O(n) (insertion at the end)
    //Average case: O(n) (as in general, insertion will require traversal)

    public void deleteFromHead(){
        if(head != null) {  // It's a direct way of deleting a Node from the head.
            head = head.next;
            // This means the current head node is bypassed, and now the second node becomes the new head.
            // The original first node has no reference pointing to it, so it becomes eligible for garbage collection.
        }

        // The TC for deleting the node from the Head is O(1).

            // Alternate Way to delete the Head. This approach helps to check if the head is empty or not.
//            if(head == null){
//                System.out.println("List is Empty");
//                return;
//            }
//            head = head.next;
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();


        list.insertAtBeginning(20);
        list.insertAtBeginning(15);
        list.insertAtBeginning(5);

        list.insertionAtPoisiton(10,1);
        list.insertionAtPoisiton(25,10);

        list.insertAtEnd(30);
        list.insertAtEnd(40);
        list.insertAtEnd(50);

        list.deleteFromHead();  // It deletes 5 from the Head.

        list.printList();
    }
}


// https://chatgpt.com/share/671f755f-7bb4-800c-8710-c540df4f235c


