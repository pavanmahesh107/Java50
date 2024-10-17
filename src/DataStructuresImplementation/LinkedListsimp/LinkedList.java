package DataStructuresImplementation.LinkedListsimp;

public class LinkedList {
    Node head; // Head of the List

    //Node class remains the same
    class Node{  //Each node will store data and a reference to the next Node.
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    // Insert at begining of LinkedList.
    public void insertAtBegining(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head =newNode;
    }
}
