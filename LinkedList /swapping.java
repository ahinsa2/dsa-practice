//You are given the head of a singly linked list. Your task is to swap the first and last nodes of the linked list and return the head of the modified list.
class Node {
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}

public class SwapFirstLast {

    static Node swapFirstLast(Node head) {
        // Base case: empty list or single node
        if (head == null || head.next == null) return head;

        // If only 2 nodes, just swap them
        if (head.next.next == null) {
            Node second = head.next;
            second.next = head;
            head.next = null;
            return second;
        }

        Node prevLast = head;
        while (prevLast.next.next != null) {
            prevLast = prevLast.next;
        }

        Node last = prevLast.next;
        prevLast.next = head;   // Last node points to second node via head later
        last.next = head.next;  // Last node's next = second node
        head.next = null;       // First node becomes last
        head = last;            // Update head to last node

        return head;
    }

    static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + (temp.next != null ? "->" : "\n"));
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);

        System.out.println("Original List:");
        printList(head);

        head = swapFirstLast(head);

        System.out.println("Modified List:");
        printList(head);
    }
}
