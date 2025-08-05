class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next

def linkedListToArray(head):
    result = []
    while head:
        result.append(head.val)
        head = head.next
    return result
