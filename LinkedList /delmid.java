class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class DeleteMiddle {
    
    public static Node deleteMiddle(Node head) {
        
        if (head == null || head.next == null) {
            return null;
        }

        Node slow = head;
        Node fast = head.next; 
        Node prev = null;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            prev = slow;
            slow = slow.next;
        }

   
        if (prev != null) {
            prev.next = slow.next;
        } else {
            head = head.next; 
        }

        return head;
    }

    public static void printList(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }
}
