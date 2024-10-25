package DataStructuresImplementation.LinkedListsimp;

public class LinkedListTraversal {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.head = new Node(10);
        Node sec =  new Node(20);
        Node thr = new Node(30);

        list.head.next = sec;
        sec.next = thr;

        list.traverse();
    }
}
