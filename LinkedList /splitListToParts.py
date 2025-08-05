# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def splitListToParts(self, head: Optional[ListNode], k: int) -> List[Optional[ListNode]]:
        total_length = 0
        curr = head
        while curr:
            total_length += 1
            curr = curr.next

        part_size = total_length // k
        remainder = total_length % k

        result = []
        curr = head

        for i in range(k):
            part_head = curr
            current_part_size = part_size + (1 if i < remainder else 0)
            
            for j in range(current_part_size - 1):
                if curr:
                    curr = curr.next
            if curr:
                temp = curr.next
                curr.next = None
                curr = temp
            result.append(part_head)

        return result
