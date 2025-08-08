"""  list Node is as defined below:

class Node:
    def __init__(self, data):
		self.data = data
		self.next = None

"""

# complete this function
# return head of list after swapping
class Solution:    
    def pairWiseSwap(self, head):
        # code here
        if head is None or head.next is None:
            return head
    
        # New head will be the second node
        new_head = head.next
    
        prev = None
        current = head
    
        # Traverse the list in pairs
        while current and current.next:
            first = current
            second = current.next
    
            # Swapping nodes by changing links
            first.next = second.next
            second.next = first
    
            if prev:
                prev.next = second
    
            # Move to the next pair
            prev = first
            current = first.next
    
        return new_head
    
    def print_list(head):
        temp = head
        while temp:
            print(temp.data, end=" -> ")
            temp = temp.next
        print("None")
