class ListNode {
    int val;
    ListNode next;
    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class Solution {
    public boolean searchKey(ListNode head, int key) {
        ListNode current = head;
        while (current != null) {
            if (current.val == key) {
                return true;
            }
            current = current.next;
        }
        return false;
    }
}
