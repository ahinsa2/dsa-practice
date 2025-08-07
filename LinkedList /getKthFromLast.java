/* Structure of node
class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
} */

class Solution {

    // Function to find the data of kth node from
    // the end of a linked list.
    int getKthFromLast(Node head, int k) {
        // Your code here
        Node first = head;
        Node second = head;

        // Move first pointer k steps ahead
        for (int i = 0; i < k; i++) {
            if (first == null) {
                return -1; // k is more than the number of nodes
            }
            first = first.next;
        }

        // Move both pointers until first reaches the end
        while (first != null) {
            first = first.next;
            second = second.next;
        }

        return (second != null) ? second.data : -1;
    }
}
