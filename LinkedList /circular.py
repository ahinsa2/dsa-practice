class Node:
    def __init__(self, data):
        self.data = data
        self.next = None


# your task is to complete this function
# function should return true/false or 1/0
class Solution:
    def isCircular(self, head):
        # Code here
        if head is None:
            return True  

        slow = head
        fast = head.next
    
        while fast is not None and fast.next is not None:
            if slow == fast:
                return True  
            slow = slow.next
            fast = fast.next.next
