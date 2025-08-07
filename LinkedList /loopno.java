/*
class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
}
*/

class Solution {
    public int lengthOfLoop(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return countLoopLength(slow);
            }
        }
        return 0;
    }

    private static int countLoopLength(Node nodeInLoop) {
        Node temp = nodeInLoop;
        int count = 1;

        while (temp.next != nodeInLoop) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    // Helper method to create a looped list
    public static Node createLinkedListWithLoop(int[] values, int c) {
        Node head = new Node(values[0]);
        Node current = head;
        Node loopNode = null;

        for (int i = 1; i < values.length; i++) {
            current.next = new Node(values[i]);
            current = current.next;
            if (i == c) {
                loopNode = current;
            }
        }

        if (c != 0) {
            current.next = loopNode;
        }

        return head;
        // code here.
    }
}
