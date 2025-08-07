'''
	{
		# Node Class
		class Node:
		    def __init__(self, data):   # data -> value stored in node
		        self.data = data
		        self.next = None
	}
'''
class Solution:
    def getKthFromLast(self, head, k):
        #code here
        slow = head
        fast = head
    
        
        for _ in range(k):
            if not fast:
                return -1  
            fast = fast.next
    
        
        while fast:
            slow = slow.next
            fast = fast.next
    
        
        return slow.data if slow else -1
