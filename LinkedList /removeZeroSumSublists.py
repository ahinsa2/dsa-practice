# Definition for singly-linked list.
class ListNode:
     def __init__(self, val=0, next=None):
         self.val = val
         self.next = next
class Solution:
    def removeZeroSumSublists(self, head: Optional[ListNode]) -> Optional[ListNode]:
        dummy = ListNode(0)
        dummy.next = head
        prefix_sum = 0
        sum_map = {}

        curr = dummy
        while curr:
            prefix_sum += curr.val
            sum_map[prefix_sum] = curr
            curr = curr.next

        prefix_sum = 0
        curr = dummy
        while curr:
            prefix_sum += curr.val
            curr.next = sum_map[prefix_sum].next
            curr = curr.next

        return dummy.next
        
