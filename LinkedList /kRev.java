//You are given the head of a singly linked list. Reverse the linked list in groups of size k and return the new head.If the number of nodes is not a multiple of k, the remaining nodes should remain in the same order.
class Node {
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}

public class ReverseKGroups {

    static Node reverseKGroup(Node head, int k) {
        Node curr = head, prev = null, next = null;
        int count = 0;

        // Count nodes to check if we have at least k nodes
        Node temp = head;
        for (int i = 0; i < k; i++) {
            if (temp == null) return head;
            temp = temp.next;
        }

        // Reverse first k nodes
        while (count < k && curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            count++;
        }

        // Now 'head' is the end of reversed group, link with next reversed group
        if (next != null) {
            head.next = reverseKGroup(next, k);
        }

        return prev;
    }

    static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + (temp.next != null ? "->" : "\n"));
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);
        head.next.next.next.next.next.next = new Node(7);
        head.next.next.next.next.next.next.next = new Node(8);

        System.out.println("Original List:");
        printList(head);

        head = reverseKGroup(head, 3);

        System.out.println("Modified List:");
        printList(head);
    }
}
