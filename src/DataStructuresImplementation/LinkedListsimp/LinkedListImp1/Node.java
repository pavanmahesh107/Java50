package DataStructuresImplementation.LinkedListsimp.LinkedListImp1;

class Node {
    int data;
    Node next_NodeRef;  // Reference to the Next node
    // Since next node is also a NODE, we declare next as a reference to a NODE

    Node(int data) {
        this.data = data;
        this.next_NodeRef = null;
    }
}

class LinkedListExample {
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next_NodeRef = new Node(15);

//        System.out.println(head.data);
//        System.out.println(head.next_NodeRef.data);

        // Inserting at the begining of the LinkedList,So before HEAD, I have to insert.
        Node newHead = new Node(5);
        newHead.next_NodeRef = head;

//        System.out.println(newHead.data);
//        System.out.println(head.data);
//        System.out.println(head.next_NodeRef.data);

        // Inserting at middle of LinkedList, So NEW NODE should be In between HEAD & LAST NODE
        Node mideNode = new Node(7);
        mideNode.next_NodeRef = head.next_NodeRef;
        head.next_NodeRef = mideNode;

    }

}

