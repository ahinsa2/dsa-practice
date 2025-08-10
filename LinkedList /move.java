/*

Definition for singly Link List Node
class Node
{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}

You can also use the following for printing the link list.
Node.printList(Node node);
*/

class Solution {
    public static Node moveToFront(Node head) {
        // code here
        if (head == null || head.next == null) {
            return head;
        }

        Node secondLast = head;
        
        
        while (secondLast.next != null && secondLast.next.next != null) {
            secondLast = secondLast.next;
        }

        Node last = secondLast.next; 
        secondLast.next = null;      
        last.next = head;            
        head = last;                 
        
        return head;
    }
}
