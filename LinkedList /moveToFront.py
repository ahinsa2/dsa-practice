from typing import Optional

"""

Definition for singly Link List Node
class Node:
    def __init__(self,x):
        self.data=x
        self.next=None

You can also use the following for printing the link list.
printList(node)
"""

class Solution:
    def moveToFront(self, head : Optional['Node']) -> Optional['Node']:
        # code here
        if not head or not head.next:
            return head  
    

        second_last = head
        while second_last.next and second_last.next.next:
            second_last = second_last.next
    
        
        last = second_last.next
        second_last.next = None
        last.next = head
        head = last
    
        return head
