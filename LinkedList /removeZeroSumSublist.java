/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeZeroSumSublists(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        Map<Integer, ListNode> sumMap = new HashMap<>();
        int prefixSum = 0;
        ListNode curr = dummy;

        while (curr != null) {
            prefixSum += curr.val;
            sumMap.put(prefixSum, curr);
            curr = curr.next;
        }

        prefixSum = 0;
        curr = dummy;
        while (curr != null) {
            prefixSum += curr.val;
            curr.next = sumMap.get(prefixSum).next;
            curr = curr.next;
        }

        return dummy.next;
        
    }
}
